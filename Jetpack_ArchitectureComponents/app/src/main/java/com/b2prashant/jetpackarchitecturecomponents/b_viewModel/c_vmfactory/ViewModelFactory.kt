package com.b2prashant.jetpackarchitecturecomponents.b_viewModel.c_vmfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(val initialCount: Int): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModelWithArgument(initialCount) as T
    }
}