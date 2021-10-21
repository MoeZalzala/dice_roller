package com.example.diceroller.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.ui.DiceFragment
import com.example.diceroller.R

class MainActivity : AppCompatActivity() {

    private val diceFragment = DiceFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateFragments()
    }

    private fun generateFragments() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.dice_fragment, diceFragment)
        transaction.commit()
    }
}