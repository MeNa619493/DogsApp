package com.example.dogsapp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, url: String?) {
    view.loadImage(url, getProgressDrawable(view.context))
}