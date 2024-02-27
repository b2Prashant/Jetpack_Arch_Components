package com.b2prashant.jetpackarchitecturecomponents.d_viewBinding.E_dataBinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.b2prashant.jetpackarchitecturecomponents.Quote
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityOnewayDbBinding
import com.b2prashant.jetpackarchitecturecomponents.e_dataBindg.b_onew_ldb.LiveDBOnewayActivity

class DataBindgOneWActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnewayDbBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //using data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_oneway_db)
        //using dataBinding => declarative assigning our quote variable from xml
        val quoteObj = Quote("Satyameva Jayate", "- Pandit MMM")
        binding.quote = quoteObj
    }
    fun updateQuote(view: View) {
        binding.quote = Quote("Freedom is never dear at any price...", "M Gandhi")
    }

    fun openLiveDataBinding(view: View) {
        startActivity(Intent(this, LiveDBOnewayActivity::class.java))
        finish()
    }
}