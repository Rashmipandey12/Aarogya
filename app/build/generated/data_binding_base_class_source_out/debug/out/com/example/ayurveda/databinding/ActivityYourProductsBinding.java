// Generated by view binder compiler. Do not edit!
package com.example.ayurveda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ayurveda.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityYourProductsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addprodfloatingbtn;

  @NonNull
  public final ImageButton backtoHomebtn;

  @NonNull
  public final TextView docNamePtxt;

  @NonNull
  public final ImageButton homenavbtn1;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView8;

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
  public final TextView textView9;

  @NonNull
  public final TextView unamenavbar;

  @NonNull
  public final ImageButton userAppointmentsbtn;

  @NonNull
  public final TextView userName10;

  @NonNull
  public final ImageButton userProfileNavbtn;

  @NonNull
  public final RecyclerView yourprodrecyclerView;

  private ActivityYourProductsBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addprodfloatingbtn, @NonNull ImageButton backtoHomebtn,
      @NonNull TextView docNamePtxt, @NonNull ImageButton homenavbtn1,
      @NonNull ImageView imageView10, @NonNull ImageView imageView8,
      @NonNull ImageButton remedyNavBtn, @NonNull ImageButton storenavbtn,
      @NonNull TextView textView11, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView9, @NonNull TextView unamenavbar,
      @NonNull ImageButton userAppointmentsbtn, @NonNull TextView userName10,
      @NonNull ImageButton userProfileNavbtn, @NonNull RecyclerView yourprodrecyclerView) {
    this.rootView = rootView;
    this.addprodfloatingbtn = addprodfloatingbtn;
    this.backtoHomebtn = backtoHomebtn;
    this.docNamePtxt = docNamePtxt;
    this.homenavbtn1 = homenavbtn1;
    this.imageView10 = imageView10;
    this.imageView8 = imageView8;
    this.remedyNavBtn = remedyNavBtn;
    this.storenavbtn = storenavbtn;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView9 = textView9;
    this.unamenavbar = unamenavbar;
    this.userAppointmentsbtn = userAppointmentsbtn;
    this.userName10 = userName10;
    this.userProfileNavbtn = userProfileNavbtn;
    this.yourprodrecyclerView = yourprodrecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityYourProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityYourProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_your_products, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityYourProductsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addprodfloatingbtn;
      FloatingActionButton addprodfloatingbtn = ViewBindings.findChildViewById(rootView, id);
      if (addprodfloatingbtn == null) {
        break missingId;
      }

      id = R.id.backtoHomebtn;
      ImageButton backtoHomebtn = ViewBindings.findChildViewById(rootView, id);
      if (backtoHomebtn == null) {
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

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
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

      id = R.id.userName10;
      TextView userName10 = ViewBindings.findChildViewById(rootView, id);
      if (userName10 == null) {
        break missingId;
      }

      id = R.id.userProfileNavbtn;
      ImageButton userProfileNavbtn = ViewBindings.findChildViewById(rootView, id);
      if (userProfileNavbtn == null) {
        break missingId;
      }

      id = R.id.yourprodrecyclerView;
      RecyclerView yourprodrecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (yourprodrecyclerView == null) {
        break missingId;
      }

      return new ActivityYourProductsBinding((ConstraintLayout) rootView, addprodfloatingbtn,
          backtoHomebtn, docNamePtxt, homenavbtn1, imageView10, imageView8, remedyNavBtn,
          storenavbtn, textView11, textView13, textView14, textView9, unamenavbar,
          userAppointmentsbtn, userName10, userProfileNavbtn, yourprodrecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
