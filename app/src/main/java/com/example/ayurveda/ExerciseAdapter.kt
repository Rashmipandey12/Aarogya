package com.example.ayurveda

import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(private val exercises: List<Exercise>) :
    RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    inner class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.exercise_image)
        val titleView: TextView = itemView.findViewById(R.id.exercise_title)
        val descriptionView: TextView = itemView.findViewById(R.id.exercise_description)
        val videoView: VideoView = itemView.findViewById(R.id.exercise_video)
        val playButton: ImageView = itemView.findViewById(R.id.play_button)
        val videoContainer: FrameLayout = itemView.findViewById(R.id.video_container)
        val loadingSpinner: ProgressBar = itemView.findViewById(R.id.loading_spinner)
        val seekBar: SeekBar = itemView.findViewById(R.id.video_seekbar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exercises[position]
        holder.imageView.setImageResource(exercise.imageResId)
        holder.titleView.text = exercise.title
        holder.descriptionView.text = exercise.description

        val videoUri: Uri? = when {
            exercise.videoUrl != null -> Uri.parse(exercise.videoUrl)
            exercise.videoResId != null -> Uri.parse("android.resource://${holder.itemView.context.packageName}/${exercise.videoResId}")
            else -> null
        }

        if (videoUri != null) {
            holder.videoView.visibility = View.VISIBLE
            holder.playButton.visibility = View.VISIBLE
            holder.seekBar.visibility = View.VISIBLE
            holder.loadingSpinner.visibility = View.VISIBLE

            holder.videoView.setVideoURI(videoUri)

            holder.videoView.setOnPreparedListener { mediaPlayer ->
                holder.loadingSpinner.visibility = View.GONE
                holder.seekBar.max = holder.videoView.duration

                holder.videoView.pause()
                holder.playButton.setImageResource(android.R.drawable.ic_media_play)
                holder.playButton.visibility = View.VISIBLE

                val handler = Handler(Looper.getMainLooper())
                val updateSeekBar = object : Runnable {
                    override fun run() {
                        if (holder.videoView.isPlaying) {
                            holder.seekBar.progress = holder.videoView.currentPosition
                            handler.postDelayed(this, 500)
                        }
                    }
                }

                holder.playButton.setOnClickListener {
                    if (holder.videoView.isPlaying) {
                        holder.videoView.pause()
                        holder.playButton.setImageResource(android.R.drawable.ic_media_play)
                    } else {
                        holder.videoView.start()
                        holder.playButton.setImageResource(android.R.drawable.ic_media_pause)
                        handler.post(updateSeekBar)
                    }
                }

                holder.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        if (fromUser) {
                            holder.videoView.seekTo(progress)
                        }
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {}
                    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
                })
            }

            holder.videoView.setOnCompletionListener {
                holder.playButton.setImageResource(android.R.drawable.ic_media_play)
                holder.playButton.visibility = View.VISIBLE
                holder.seekBar.progress = 0
            }
        } else {
            holder.videoView.visibility = View.GONE
            holder.playButton.visibility = View.GONE
            holder.seekBar.visibility = View.GONE
            holder.loadingSpinner.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int = exercises.size
}
