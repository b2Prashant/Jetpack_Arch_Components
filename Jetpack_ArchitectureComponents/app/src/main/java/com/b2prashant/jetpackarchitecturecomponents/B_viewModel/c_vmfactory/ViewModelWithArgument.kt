package com.b2prashant.jetpackarchitecturecomponents.vmfactory

import androidx.lifecycle.ViewModel

class ViewModelWithArgument(val initialCount : Int): ViewModel() {
    // here we are receiving value in constructor

    var count: Int = initialCount

    fun increase() {
        ++count
    }
}