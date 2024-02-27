package com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.b_onew_ldb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityLiveDbonewayBinding
import com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.c_twoway.DataBindTwowayActivity

class LiveDBOnewayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDbonewayBinding
    private lateinit var viewModelLDB : LiveDBOnewayVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_dboneway)
        viewModelLDB = ViewModelProvider(this)[LiveDBOnewayVM::class.java]
        //not needed as directly accessing in xml
        /* viewModel.quoteLD.observe(this) {
             binding.tvQuoteText.text = it.quoteText
             binding.tvQuoteAuthor.text = it.author   }*/
        binding.viewModelLDB = viewModelLDB
        binding.lifecycleOwner = this
    }
    //not needed - as updating via dataBinging
    /*fun updateQuote(view: View) { viewModel.updateQuote()  }*/

    fun openTwoDataBinding(view: View) {
        startActivity(Intent(this, DataBindTwowayActivity::class.java))
        finish()
    }
}