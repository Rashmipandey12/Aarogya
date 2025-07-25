// Generated by view binder compiler. Do not edit!
package com.example.ayurveda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityDoctorProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView avatarP;

  @NonNull
  public final ImageButton backtoHomebtn;

  @NonNull
  public final Button booknowbtndocprof;

  @NonNull
  public final TextView docNamePtxt;

  @NonNull
  public final ImageButton homenavbtn1;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView28;

  @NonNull
  public final ImageView imageView30;

  @NonNull
  public final ImageView imageView31;

  @NonNull
  public final ImageView imageView32;

  @NonNull
  public final ImageView imageView33;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageButton mapbtn;

  @NonNull
  public final ImageButton remedyNavBtn;

  @NonNull
  public final ImageButton storenavbtn;

  @NonNull
  public final TextView subuserEmail;

  @NonNull
  public final TextView subuserName;

  @NonNull
  public final TextView subuserPassword;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView unamenavbar;

  @NonNull
  public final ImageButton userAppointmentsbtn;

  @NonNull
  public final TextView userName;

  @NonNull
  public final ImageButton userProfileNavbtn;

  private ActivityDoctorProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView avatarP, @NonNull ImageButton backtoHomebtn,
      @NonNull Button booknowbtndocprof, @NonNull TextView docNamePtxt,
      @NonNull ImageButton homenavbtn1, @NonNull ImageView imageView10,
      @NonNull ImageView imageView28, @NonNull ImageView imageView30,
      @NonNull ImageView imageView31, @NonNull ImageView imageView32,
      @NonNull ImageView imageView33, @NonNull ImageView imageView8, @NonNull ImageButton mapbtn,
      @NonNull ImageButton remedyNavBtn, @NonNull ImageButton storenavbtn,
      @NonNull TextView subuserEmail, @NonNull TextView subuserName,
      @NonNull TextView subuserPassword, @NonNull TextView textView11, @NonNull TextView textView13,
      @NonNull TextView textView14, @NonNull TextView textView8, @NonNull TextView textView9,
      @NonNull TextView unamenavbar, @NonNull ImageButton userAppointmentsbtn,
      @NonNull TextView userName, @NonNull ImageButton userProfileNavbtn) {
    this.rootView = rootView;
    this.avatarP = avatarP;
    this.backtoHomebtn = backtoHomebtn;
    this.booknowbtndocprof = booknowbtndocprof;
    this.docNamePtxt = docNamePtxt;
    this.homenavbtn1 = homenavbtn1;
    this.imageView10 = imageView10;
    this.imageView28 = imageView28;
    this.imageView30 = imageView30;
    this.imageView31 = imageView31;
    this.imageView32 = imageView32;
    this.imageView33 = imageView33;
    this.imageView8 = imageView8;
    this.mapbtn = mapbtn;
    this.remedyNavBtn = remedyNavBtn;
    this.storenavbtn = storenavbtn;
    this.subuserEmail = subuserEmail;
    this.subuserName = subuserName;
    this.subuserPassword = subuserPassword;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.unamenavbar = unamenavbar;
    this.userAppointmentsbtn = userAppointmentsbtn;
    this.userName = userName;
    this.userProfileNavbtn = userProfileNavbtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarP;
      CircleImageView avatarP = ViewBindings.findChildViewById(rootView, id);
      if (avatarP == null) {
        break missingId;
      }

      id = R.id.backtoHomebtn;
      ImageButton backtoHomebtn = ViewBindings.findChildViewById(rootView, id);
      if (backtoHomebtn == null) {
        break missingId;
      }

      id = R.id.booknowbtndocprof;
      Button booknowbtndocprof = ViewBindings.findChildViewById(rootView, id);
      if (booknowbtndocprof == null) {
        break missingId;
      }

      id = R.id.docNamePtxt;
      TextView docNamePtxt = ViewBindings.findChildViewById(rootView, id);
      if (docNamePtxt == null) {
        break missingId;
      }

      id = R.id.homenavbtn_1;
      ImageButton homenavbtn1 = ViewBindings.findChildViewById(rootView, id);
      if (homenavbtn1 == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView28;
      ImageView imageView28 = ViewBindings.findChildViewById(rootView, id);
      if (imageView28 == null) {
        break missingId;
      }

      id = R.id.imageView30;
      ImageView imageView30 = ViewBindings.findChildViewById(rootView, id);
      if (imageView30 == null) {
        break missingId;
      }

      id = R.id.imageView31;
      ImageView imageView31 = ViewBindings.findChildViewById(rootView, id);
      if (imageView31 == null) {
        break missingId;
      }

      id = R.id.imageView32;
      ImageView imageView32 = ViewBindings.findChildViewById(rootView, id);
      if (imageView32 == null) {
        break missingId;
      }

      id = R.id.imageView33;
      ImageView imageView33 = ViewBindings.findChildViewById(rootView, id);
      if (imageView33 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.mapbtn;
      ImageButton mapbtn = ViewBindings.findChildViewById(rootView, id);
      if (mapbtn == null) {
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

      id = R.id.subuserEmail;
      TextView subuserEmail = ViewBindings.findChildViewById(rootView, id);
      if (subuserEmail == null) {
        break missingId;
      }

      id = R.id.subuserName;
      TextView subuserName = ViewBindings.findChildViewById(rootView, id);
      if (subuserName == null) {
        break missingId;
      }

      id = R.id.subuserPassword;
      TextView subuserPassword = ViewBindings.findChildViewById(rootView, id);
      if (subuserPassword == null) {
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

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
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

      id = R.id.userName;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      id = R.id.userProfileNavbtn;
      ImageButton userProfileNavbtn = ViewBindings.findChildViewById(rootView, id);
      if (userProfileNavbtn == null) {
        break missingId;
      }

      return new ActivityDoctorProfileBinding((ConstraintLayout) rootView, avatarP, backtoHomebtn,
          booknowbtndocprof, docNamePtxt, homenavbtn1, imageView10, imageView28, imageView30,
          imageView31, imageView32, imageView33, imageView8, mapbtn, remedyNavBtn, storenavbtn,
          subuserEmail, subuserName, subuserPassword, textView11, textView13, textView14, textView8,
          textView9, unamenavbar, userAppointmentsbtn, userName, userProfileNavbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
