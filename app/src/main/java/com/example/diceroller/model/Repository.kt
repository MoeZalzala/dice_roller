package com.example.diceroller.model

import com.example.diceroller.viewModel.DiceFragmentViewModel

class Repository {
    private val viewModel = DiceFragmentViewModel()

    fun generateRandomNumber(){
        viewModel.generateRandomNumber()
    }
}