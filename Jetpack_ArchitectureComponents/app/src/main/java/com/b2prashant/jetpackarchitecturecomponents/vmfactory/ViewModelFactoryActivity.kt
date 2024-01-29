package com.b2prashant.jetpackarchitecturecomponents.vmfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R

class ViewModelFactoryActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "ViewModelFactoryActivity"
    }
    private lateinit var tvCounter: TextView
    private lateinit var viewModelWithArgument: ViewModelWithArgument
    private val initialCount = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_factory)
        //passing lifecycle owner, ViewModelFactory and ViewModel to ViewProvider to get object of ViewModel
        viewModelWithArgument = ViewModelProvider(this, ViewModelFactory(initialCount)).get(ViewModelWithArgument::class.java)
        Log.d(TAG, "ViewModelFactoryActivity onCreate()")
        tvCounter = findViewById(R.id.tvCounter)
        Toast.makeText(this, "Passing initial value to VM using VMFactory", Toast.LENGTH_LONG).show()
        setCountText()
    }

    fun increaseCounter(view: View) {
        viewModelWithArgument.increase()
        setCountText()
    }

    fun setCountText() {
        tvCounter.text = viewModelWithArgument.count.toString()
    }

    fun goBackToMainActivity(view: View) {
        finish()
    }
}