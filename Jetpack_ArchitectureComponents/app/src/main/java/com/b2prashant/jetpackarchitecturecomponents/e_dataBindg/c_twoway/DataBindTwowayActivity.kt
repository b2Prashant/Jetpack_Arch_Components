package com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.c_twoway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityDataBindTwowayBinding
import com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.d_twow_ldb.LiveDBTwowayActivity

class DataBindTwowayActivity : AppCompatActivity() {
    lateinit var binding: ActivityDataBindTwowayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //using data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_bind_twoway)
        //using dataBinding => declarative assigning our quote variable from xml
        val quoteObj = Quote2("Satyameva Jayate - Pandit MMM")
        binding.quote2 = quoteObj
        binding.lifecycleOwner = this
        //TODO: check for update from xml
        binding.etQuote.doOnTextChanged { text, start, before, count ->  binding.quote2 = Quote2(text.toString())}
    }
    fun updateQuote(view: View) {
        binding.quote2 = Quote2("Freedom is never dear at any price.. - M Gandhi")
    }

    fun openLiveDataBinding(view: View) {
        startActivity(Intent(this, LiveDBTwowayActivity::class.java))
        finish()
    }
}