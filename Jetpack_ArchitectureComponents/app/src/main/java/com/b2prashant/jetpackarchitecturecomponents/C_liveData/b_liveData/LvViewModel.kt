package com.b2prashant.jetpackarchitecturecomponents.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LvViewModel: ViewModel() {
    private val counterMLD = MutableLiveData<Int>(0)
    val counterLD : LiveData<Int>
        get() = counterMLD

    private val factMLiveData = MutableLiveData<String>("this is mutable live data")
    val factLiveData : LiveData<String>
        get() = factMLiveData

    fun incrementCounter() {
        counterMLD.value = counterMLD.value?.plus(1)
    }

    fun updateLiveData() {
        factMLiveData.value = "Another fact updated"
    }

}