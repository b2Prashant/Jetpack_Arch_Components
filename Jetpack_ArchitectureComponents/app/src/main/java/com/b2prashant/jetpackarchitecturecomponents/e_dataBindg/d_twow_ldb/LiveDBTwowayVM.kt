package com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.d_twow_ldb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.c_twoway.Quote2

class LiveDBTwowayVM: ViewModel() {
    val quoteMLD = MutableLiveData<String>()
    init {
        quoteMLD.value = "karo ya maro - M Gandhi"
    }
    fun updateQuote() {
        quoteMLD.value = "Jai Hind - Netaji S Chand"
    }
}