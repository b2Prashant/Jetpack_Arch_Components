package com.b2prashant.jetpackarchitecturecomponents.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MlvViewModel: ViewModel() {
    val counterMLD = MutableLiveData<Int>(0)
    val factMLiveData = MutableLiveData<String>("this is mutable live data")

    fun incrementCounter() {
        counterMLD.value = counterMLD.value?.plus(1)
    }

    fun updateLiveData() {
        factMLiveData.value = "Another fact updated"
    }

}