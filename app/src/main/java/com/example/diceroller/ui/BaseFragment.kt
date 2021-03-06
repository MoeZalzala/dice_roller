package com.example.diceroller.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment <T: ViewDataBinding, view : ViewModel > : Fragment() {

    private lateinit var _binding : ViewDataBinding
    protected lateinit var viewModel : view

    val binding : T get() = _binding as T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater,
            getFragment(),
            container,
            false
        )
        _binding.lifecycleOwner = viewLifecycleOwner
        viewModel = ViewModelProvider(this).get(getViewModel())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    abstract fun setup()

    abstract fun getViewModel(): Class<view>

    abstract fun getFragment(): Int

}