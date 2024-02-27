package com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.b_onew_ldb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.b2prashant.jetpackarchitecturecomponents.Quote

class LiveDBOnewayVM: ViewModel() {
    private val quoteMLD = MutableLiveData(Quote("karo ya maro", "- M Gandhi"))
    val quoteLD: LiveData<Quote>
        get() = quoteMLD
    fun updateQuote() {
        quoteMLD.value = Quote("Jai Hind", "- Netaji S Chand")
    }
}