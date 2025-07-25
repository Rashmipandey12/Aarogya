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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUsersRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageButton regasdoctor;

  @NonNull
  public final ImageButton signinbtn;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final EditText uemail;

  @NonNull
  public final EditText uname;

  @NonNull
  public final EditText upassword;

  @NonNull
  public final EditText urepassword;

  @NonNull
  public final Button userregisterbtn;

  private ActivityUsersRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView imageView5, @NonNull ImageView imageView6, @NonNull ImageButton regasdoctor,
      @NonNull ImageButton signinbtn, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull EditText uemail, @NonNull EditText uname, @NonNull EditText upassword,
      @NonNull EditText urepassword, @NonNull Button userregisterbtn) {
    this.rootView = rootView;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.regasdoctor = regasdoctor;
    this.signinbtn = signinbtn;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.uemail = uemail;
    this.uname = uname;
    this.upassword = upassword;
    this.urepassword = urepassword;
    this.userregisterbtn = userregisterbtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUsersRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUsersRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_users_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUsersRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView5;
      TextView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.regasdoctor;
      ImageButton regasdoctor = ViewBindings.findChildViewById(rootView, id);
      if (regasdoctor == null) {
        break missingId;
      }

      id = R.id.signinbtn;
      ImageButton signinbtn = ViewBindings.findChildViewById(rootView, id);
      if (signinbtn == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.uemail;
      EditText uemail = ViewBindings.findChildViewById(rootView, id);
      if (uemail == null) {
        break missingId;
      }

      id = R.id.uname;
      EditText uname = ViewBindings.findChildViewById(rootView, id);
      if (uname == null) {
        break missingId;
      }

      id = R.id.upassword;
      EditText upassword = ViewBindings.findChildViewById(rootView, id);
      if (upassword == null) {
        break missingId;
      }

      id = R.id.urepassword;
      EditText urepassword = ViewBindings.findChildViewById(rootView, id);
      if (urepassword == null) {
        break missingId;
      }

      id = R.id.userregisterbtn;
      Button userregisterbtn = ViewBindings.findChildViewById(rootView, id);
      if (userregisterbtn == null) {
        break missingId;
      }

      return new ActivityUsersRegisterBinding((ConstraintLayout) rootView, imageView5, imageView6,
          regasdoctor, signinbtn, textView4, textView5, uemail, uname, upassword, urepassword,
          userregisterbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
