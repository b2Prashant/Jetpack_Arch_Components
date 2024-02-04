package com.b2prashant.jetpackarchitecturecomponents.B_viewModel.b_VM

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var count: Int = 0

    fun increment() {
        ++count
    }
}