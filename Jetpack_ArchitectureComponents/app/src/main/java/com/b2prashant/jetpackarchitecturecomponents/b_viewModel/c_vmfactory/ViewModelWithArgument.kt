package com.b2prashant.jetpackarchitecturecomponents.b_viewModel.c_vmfactory

import androidx.lifecycle.ViewModel

class ViewModelWithArgument(val initialCount : Int): ViewModel() {
    // here we are receiving value in primary constructor

    var count: Int = initialCount

    fun increase() {
        ++count
    }
}