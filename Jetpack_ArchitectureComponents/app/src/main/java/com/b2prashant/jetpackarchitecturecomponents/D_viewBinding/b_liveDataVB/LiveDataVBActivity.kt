package com.b2prashant.jetpackarchitecturecomponents.D_viewBinding.b_liveDataVB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityLiveDataVbBinding

class LiveDataVBActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "LiveDataVBActivity"
    }
    private lateinit var liveDataVbBinding: ActivityLiveDataVbBinding
    private lateinit var vbViewModel : LiveDataVBViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        liveDataVbBinding = ActivityLiveDataVbBinding.inflate(layoutInflater)
        val view = liveDataVbBinding.root
        setContentView(view)
        vbViewModel = ViewModelProvider(this).get(LiveDataVBViewModel::class.java)
        //now we need to observe our live data
        vbViewModel.quoteLD.observe(this, Observer {
            liveDataVbBinding.tvQuoteText.text = it.quote
            liveDataVbBinding.tvQuoteAuthor.text = it.author
        })
        //or each view we can update separately
       /* vbViewModel.quoteLD.observe(this, Observer {
            liveDataVbBinding.tvQuoteAuthor.text = it.author
        })*/
    }

    fun updateQuote(view: View) {
        vbViewModel.updateQuote()
    }

}