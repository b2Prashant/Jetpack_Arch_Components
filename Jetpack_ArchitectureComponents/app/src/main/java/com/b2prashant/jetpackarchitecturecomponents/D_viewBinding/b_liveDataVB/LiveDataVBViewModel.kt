package com.b2prashant.jetpackarchitecturecomponents.D_viewBinding.b_liveDataVB

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.b2prashant.jetpackarchitecturecomponents.Quote

class LiveDataVBViewModel: ViewModel() {
    private val quoteMLD = MutableLiveData<Quote>(Quote("karo ya maro", "- M Gandhi"))
    val quoteLD: LiveData<Quote>
        get() = quoteMLD

    fun updateQuote() {
        quoteMLD.value = Quote("Jai Hind", "- Netaji S Chand")
    }
}