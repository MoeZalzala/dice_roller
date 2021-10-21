package com.example.diceroller.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diceroller.model.NumberGenerator
import com.example.diceroller.model.domain.DiceFace

class DiceFragmentViewModel : ViewModel() {

    private val generator = NumberGenerator()

    val generatedNumber = MutableLiveData<DiceFace>()


    fun generateRandomNumber(){
        generatedNumber.postValue(generator.generateRandomNumber())
    }

}