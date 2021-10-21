package com.example.diceroller.model

import com.example.diceroller.viewModel.DiceFragmentViewModel

class Repository {
    private val generator = NumberGenerator()

    fun generateRandomNumber() = generator.generateRandomNumber()
}