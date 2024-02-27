package com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.d_twow_ldb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityLiveDbtwowayBinding

class LiveDBTwowayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDbtwowayBinding
    private lateinit var viewModel : LiveDBTwowayVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_dbtwoway)
        viewModel = ViewModelProvider(this)[LiveDBTwowayVM::class.java]
        //not needed as directly accessing in xml
        /* viewModel.quoteLD.observe(this) {
             binding.tvQuoteText.text = it.quoteText  }*/
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
    //not needed - as updating via dataBinging
    /*fun updateQuote(view: View) { viewModel.updateQuote()  }*/

    fun goBackToMainActivity(view: View) {
        finish()
    }
}