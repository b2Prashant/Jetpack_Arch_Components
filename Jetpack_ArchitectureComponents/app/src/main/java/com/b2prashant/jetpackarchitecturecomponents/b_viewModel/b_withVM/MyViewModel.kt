package com.b2prashant.jetpackarchitecturecomponents.b_viewModel.b_withVM

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var count: Int = 0

    fun increment() {
        ++count
    }
}