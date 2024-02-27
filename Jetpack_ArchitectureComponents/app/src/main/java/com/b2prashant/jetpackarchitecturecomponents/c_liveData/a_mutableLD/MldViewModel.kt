package com.b2prashant.jetpackarchitecturecomponents.c_liveData.a_mutableLD

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MldViewModel: ViewModel() {
    val counterMLD = MutableLiveData<Int>(0)
    val factMLiveData = MutableLiveData<String>("This is an exposed- public val MLD")

    fun incrementCounter() {
        counterMLD.value = counterMLD.value?.plus(1)
    }

    fun updateLiveData() {
        factMLiveData.value = "MLD is updated through observer "
    }

}