package com.example.diceroller.model

import android.media.FaceDetector
import android.util.Log
import com.example.diceroller.R
import com.example.diceroller.model.domain.DiceFace

class NumberGenerator {
    val diceFace  = listOf<DiceFace>(
        DiceFace("1", R.drawable.alea_1),
        DiceFace("2", R.drawable.alea_2),
        DiceFace("3", R.drawable.alea_3),
        DiceFace("4", R.drawable.alea_4),
        DiceFace("5", R.drawable.alea_5),
        DiceFace("6", R.drawable.alea_6),
    )

    fun generateRandomNumber()= diceFace[(0..5).random()]
}