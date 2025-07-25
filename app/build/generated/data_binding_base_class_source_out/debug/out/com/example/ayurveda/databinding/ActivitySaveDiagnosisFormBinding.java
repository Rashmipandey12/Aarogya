// Generated by view binder compiler. Do not edit!
package com.example.ayurveda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ayurveda.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySaveDiagnosisFormBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView avatarP;

  @NonNull
  public final EditText cardno;

  @NonNull
  public final Button diagSavebtn;

  @NonNull
  public final TextView docNamePtxt;

  @NonNull
  public final ImageButton imageButton10;

  @NonNull
  public final ImageButton imageButton45;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final EditText medication;

  @NonNull
  public final EditText notes;

  @NonNull
  public final ImageButton remedyNavBtn;

  @NonNull
  public final ImageButton storenavbtn;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView unamenavbar;

  @NonNull
  public final ImageButton userAppointmentsbtn;

  @NonNull
  public final ImageButton userProfileNavbtn;

  private ActivitySaveDiagnosisFormBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView avatarP, @NonNull EditText cardno, @NonNull Button diagSavebtn,
      @NonNull TextView docNamePtxt, @NonNull ImageButton imageButton10,
      @NonNull ImageButton imageButton45, @NonNull ImageView imageView10,
      @NonNull ImageView imageView8, @NonNull EditText medication, @NonNull EditText notes,
      @NonNull ImageButton remedyNavBtn, @NonNull ImageButton storenavbtn,
      @NonNull TextView textView11, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17,
      @NonNull TextView textView9, @NonNull TextView unamenavbar,
      @NonNull ImageButton userAppointmentsbtn, @NonNull ImageButton userProfileNavbtn) {
    this.rootView = rootView;
    this.avatarP = avatarP;
    this.cardno = cardno;
    this.diagSavebtn = diagSavebtn;
    this.docNamePtxt = docNamePtxt;
    this.imageButton10 = imageButton10;
    this.imageButton45 = imageButton45;
    this.imageView10 = imageView10;
    this.imageView8 = imageView8;
    this.medication = medication;
    this.notes = notes;
    this.remedyNavBtn = remedyNavBtn;
    this.storenavbtn = storenavbtn;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.textView9 = textView9;
    this.unamenavbar = unamenavbar;
    this.userAppointmentsbtn = userAppointmentsbtn;
    this.userProfileNavbtn = userProfileNavbtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySaveDiagnosisFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySaveDiagnosisFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_save_diagnosis_form, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySaveDiagnosisFormBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarP;
      CircleImageView avatarP = ViewBindings.findChildViewById(rootView, id);
      if (avatarP == null) {
        break missingId;
      }

      id = R.id.cardno;
      EditText cardno = ViewBindings.findChildViewById(rootView, id);
      if (cardno == null) {
        break missingId;
      }

      id = R.id.diagSavebtn;
      Button diagSavebtn = ViewBindings.findChildViewById(rootView, id);
      if (diagSavebtn == null) {
        break missingId;
      }

      id = R.id.docNamePtxt;
      TextView docNamePtxt = ViewBindings.findChildViewById(rootView, id);
      if (docNamePtxt == null) {
        break missingId;
      }

      id = R.id.imageButton10;
      ImageButton imageButton10 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton10 == null) {
        break missingId;
      }

      id = R.id.imageButton45;
      ImageButton imageButton45 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton45 == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.medication;
      EditText medication = ViewBindings.findChildViewById(rootView, id);
      if (medication == null) {
        break missingId;
      }

      id = R.id.notes;
      EditText notes = ViewBindings.findChildViewById(rootView, id);
      if (notes == null) {
        break missingId;
      }

      id = R.id.remedyNavBtn;
      ImageButton remedyNavBtn = ViewBindings.findChildViewById(rootView, id);
      if (remedyNavBtn == null) {
        break missingId;
      }

      id = R.id.storenavbtn;
      ImageButton storenavbtn = ViewBindings.findChildViewById(rootView, id);
      if (storenavbtn == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.unamenavbar;
      TextView unamenavbar = ViewBindings.findChildViewById(rootView, id);
      if (unamenavbar == null) {
        break missingId;
      }

      id = R.id.userAppointmentsbtn;
      ImageButton userAppointmentsbtn = ViewBindings.findChildViewById(rootView, id);
      if (userAppointmentsbtn == null) {
        break missingId;
      }

      id = R.id.userProfileNavbtn;
      ImageButton userProfileNavbtn = ViewBindings.findChildViewById(rootView, id);
      if (userProfileNavbtn == null) {
        break missingId;
      }

      return new ActivitySaveDiagnosisFormBinding((ConstraintLayout) rootView, avatarP, cardno,
          diagSavebtn, docNamePtxt, imageButton10, imageButton45, imageView10, imageView8,
          medication, notes, remedyNavBtn, storenavbtn, textView11, textView13, textView14,
          textView15, textView16, textView17, textView9, unamenavbar, userAppointmentsbtn,
          userProfileNavbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
