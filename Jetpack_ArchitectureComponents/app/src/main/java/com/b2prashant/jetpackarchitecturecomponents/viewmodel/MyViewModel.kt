package com.b2prashant.jetpackarchitecturecomponents.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var count: Int = 0

    fun increment() {
        ++count
    }
}