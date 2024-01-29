package com.b2prashant.jetpackarchitecturecomponents.viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.b2prashant.jetpackarchitecturecomponents.R

class WithoutViewModelActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "WithoutViewModelActivity"
    }

    private var count : Int = 0
    private lateinit var tvCounter : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_without_view_model)
        Log.d(TAG, "WithoutViewModelActivity onCreate()")
        tvCounter = findViewById(R.id.tvCounter)
        Toast.makeText(this, "Without VM data loss on screen rotation", Toast.LENGTH_LONG).show()
        setCountText()
    }

    fun incrementCounter(view: View) {
        ++count
        setCountText()
    }

    fun setCountText() {
        tvCounter.text = count.toString()
    }

    fun openViewModelActivity(view: View) {
        startActivity(Intent(this, ViewModelActivity::class.java))
        finish()
    }
}