package com.b2prashant.jetpackarchitecturecomponents.C_liveData.b_liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R

class LiveDataActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "LiveDataActivity"
    }
    private lateinit var lvViewModel: LvViewModel

    private val tvCounter: TextView
        get() = findViewById(R.id.tvCounter)
    private val tvFact: TextView
        get() = findViewById(R.id.tvFact)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        Log.d(TAG, "onCreate: LiveDataActivity")
        lvViewModel = ViewModelProvider(this).get(LvViewModel::class.java)
        Toast.makeText(this, "livedata is Exposed to outside to secure mutable live data from modification", Toast.LENGTH_LONG).show()

        //now we need to observe our live data
        lvViewModel.counterLD.observe(this, Observer {
            tvCounter.text = it.toString()
        })

        lvViewModel.factLiveData.observe(this, Observer {
            tvFact.text = it
        })
    }

    fun incrementCounter(view: View) {
        lvViewModel.incrementCounter()
    }

    fun updateFact(view: View) {
        lvViewModel.updateLiveData()
    }

    fun goToLiveDataActivity(view: View) {}
}