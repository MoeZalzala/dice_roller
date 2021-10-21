package com.example.diceroller.model

import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter(value = ["setBackground"])
fun changeDiceFaceImage(view : View, image : Int){
    view.setBackgroundResource(image)
}