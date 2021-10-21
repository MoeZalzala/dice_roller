package com.example.diceroller.ui

import com.example.diceroller.viewModel.DiceFragmentViewModel
import com.example.diceroller.R
import com.example.diceroller.databinding.DiceFragmentBinding

open class DiceFragment : BaseFragment<DiceFragmentBinding, DiceFragmentViewModel>() {

    override fun getViewModel(): Class<DiceFragmentViewModel> = DiceFragmentViewModel::class.java
    override fun getFragment(): Int = R.layout.dice_fragment

    override fun setup() {
    binding.viewModel = viewModel
    }
}