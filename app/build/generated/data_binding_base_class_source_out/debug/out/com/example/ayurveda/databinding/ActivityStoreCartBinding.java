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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStoreCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backtoHomebtn2;

  @NonNull
  public final ImageView cartProdImg;

  @NonNull
  public final TextView cartProdNameEn;

  @NonNull
  public final TextView cartProdNameSn;

  @NonNull
  public final TextView cartProdPrice;

  @NonNull
  public final TextView cartProdPrice2;

  @NonNull
  public final Button checkoutbtn;

  @NonNull
  public final TextView docNamePtxt;

  @NonNull
  public final ImageButton homenavbtn1;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final TextView qty;

  @NonNull
  public final FloatingActionButton qtyminus;

  @NonNull
  public final FloatingActionButton qtyplus;

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
  public final TextView totprice;

  @NonNull
  public final TextView unamenavbar;

  @NonNull
  public final ImageButton userAppointmentsbtn;

  @NonNull
  public final TextView userName21;

  @NonNull
  public final TextView userName23;

  @NonNull
  public final ImageButton userProfileNavbtn;

  private ActivityStoreCartBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backtoHomebtn2, @NonNull ImageView cartProdImg,
      @NonNull TextView cartProdNameEn, @NonNull TextView cartProdNameSn,
      @NonNull TextView cartProdPrice, @NonNull TextView cartProdPrice2,
      @NonNull Button checkoutbtn, @NonNull TextView docNamePtxt, @NonNull ImageButton homenavbtn1,
      @NonNull ImageButton imageButton2, @NonNull ImageView imageView10,
      @NonNull ImageView imageView18, @NonNull ImageView imageView8, @NonNull TextView qty,
      @NonNull FloatingActionButton qtyminus, @NonNull FloatingActionButton qtyplus,
      @NonNull ImageButton remedyNavBtn, @NonNull ImageButton storenavbtn,
      @NonNull TextView textView11, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView9, @NonNull TextView totprice, @NonNull TextView unamenavbar,
      @NonNull ImageButton userAppointmentsbtn, @NonNull TextView userName21,
      @NonNull TextView userName23, @NonNull ImageButton userProfileNavbtn) {
    this.rootView = rootView;
    this.backtoHomebtn2 = backtoHomebtn2;
    this.cartProdImg = cartProdImg;
    this.cartProdNameEn = cartProdNameEn;
    this.cartProdNameSn = cartProdNameSn;
    this.cartProdPrice = cartProdPrice;
    this.cartProdPrice2 = cartProdPrice2;
    this.checkoutbtn = checkoutbtn;
    this.docNamePtxt = docNamePtxt;
    this.homenavbtn1 = homenavbtn1;
    this.imageButton2 = imageButton2;
    this.imageView10 = imageView10;
    this.imageView18 = imageView18;
    this.imageView8 = imageView8;
    this.qty = qty;
    this.qtyminus = qtyminus;
    this.qtyplus = qtyplus;
    this.remedyNavBtn = remedyNavBtn;
    this.storenavbtn = storenavbtn;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView9 = textView9;
    this.totprice = totprice;
    this.unamenavbar = unamenavbar;
    this.userAppointmentsbtn = userAppointmentsbtn;
    this.userName21 = userName21;
    this.userName23 = userName23;
    this.userProfileNavbtn = userProfileNavbtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStoreCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStoreCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_store_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStoreCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backtoHomebtn2;
      ImageButton backtoHomebtn2 = ViewBindings.findChildViewById(rootView, id);
      if (backtoHomebtn2 == null) {
        break missingId;
      }

      id = R.id.cartProdImg;
      ImageView cartProdImg = ViewBindings.findChildViewById(rootView, id);
      if (cartProdImg == null) {
        break missingId;
      }

      id = R.id.cartProdNameEn;
      TextView cartProdNameEn = ViewBindings.findChildViewById(rootView, id);
      if (cartProdNameEn == null) {
        break missingId;
      }

      id = R.id.cartProdNameSn;
      TextView cartProdNameSn = ViewBindings.findChildViewById(rootView, id);
      if (cartProdNameSn == null) {
        break missingId;
      }

      id = R.id.cartProdPrice;
      TextView cartProdPrice = ViewBindings.findChildViewById(rootView, id);
      if (cartProdPrice == null) {
        break missingId;
      }

      id = R.id.cartProdPrice2;
      TextView cartProdPrice2 = ViewBindings.findChildViewById(rootView, id);
      if (cartProdPrice2 == null) {
        break missingId;
      }

      id = R.id.checkoutbtn;
      Button checkoutbtn = ViewBindings.findChildViewById(rootView, id);
      if (checkoutbtn == null) {
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

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.qty;
      TextView qty = ViewBindings.findChildViewById(rootView, id);
      if (qty == null) {
        break missingId;
      }

      id = R.id.qtyminus;
      FloatingActionButton qtyminus = ViewBindings.findChildViewById(rootView, id);
      if (qtyminus == null) {
        break missingId;
      }

      id = R.id.qtyplus;
      FloatingActionButton qtyplus = ViewBindings.findChildViewById(rootView, id);
      if (qtyplus == null) {
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

      id = R.id.totprice;
      TextView totprice = ViewBindings.findChildViewById(rootView, id);
      if (totprice == null) {
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

      id = R.id.userName21;
      TextView userName21 = ViewBindings.findChildViewById(rootView, id);
      if (userName21 == null) {
        break missingId;
      }

      id = R.id.userName23;
      TextView userName23 = ViewBindings.findChildViewById(rootView, id);
      if (userName23 == null) {
        break missingId;
      }

      id = R.id.userProfileNavbtn;
      ImageButton userProfileNavbtn = ViewBindings.findChildViewById(rootView, id);
      if (userProfileNavbtn == null) {
        break missingId;
      }

      return new ActivityStoreCartBinding((ConstraintLayout) rootView, backtoHomebtn2, cartProdImg,
          cartProdNameEn, cartProdNameSn, cartProdPrice, cartProdPrice2, checkoutbtn, docNamePtxt,
          homenavbtn1, imageButton2, imageView10, imageView18, imageView8, qty, qtyminus, qtyplus,
          remedyNavBtn, storenavbtn, textView11, textView13, textView14, textView9, totprice,
          unamenavbar, userAppointmentsbtn, userName21, userName23, userProfileNavbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
