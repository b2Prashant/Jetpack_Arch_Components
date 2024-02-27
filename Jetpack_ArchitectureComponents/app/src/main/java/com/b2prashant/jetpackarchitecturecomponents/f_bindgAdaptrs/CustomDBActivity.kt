package com.b2prashant.jetpackarchitecturecomponents.f_bindgAdaptrs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.databinding.ActivityCustomDbactivityBinding

class CustomDBActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityCustomDbactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_dbactivity)
        val post = Post("BindingAdapters",
            "CustomDataBinding", " https://picsum.photos/200/300")
        binding.post = post
        //binding.lifecycleOwner = this
    }
}