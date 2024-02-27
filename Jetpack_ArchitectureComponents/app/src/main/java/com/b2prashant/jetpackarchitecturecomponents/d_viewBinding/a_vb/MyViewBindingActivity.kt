package com.b2prashant.jetpackarchitecturecomponents.d_viewBinding.a_vb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.b2prashant.jetpackarchitecturecomponents.d_viewBinding.b_liveDataVB.LiveDataVBActivity
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityMyViewBindingBinding

class MyViewBindingActivity : AppCompatActivity() {
    private companion object{
        private const val TAG = "ViewBindingActivity"
    }
    private lateinit var binding: ActivityMyViewBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_my_view_binding)
        //Adding view binding in activity
        binding = ActivityMyViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tvQuoteText.text = "Inquilab Zindabad"
        binding.tvQuoteAuthor.text = "-Shaheed Bhagat Singh"
    }

    fun openViewBindingLiveDataActivity(view: View) {
        startActivity(Intent(this, LiveDataVBActivity::class.java))
        finish()
    }
}