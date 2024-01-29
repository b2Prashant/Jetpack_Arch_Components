package com.b2prashant.jetpackarchitecturecomponents.livedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R

class MutableLiveDataActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MutableLiveDataActivity"
    }
    private lateinit var mlvViewModel: MlvViewModel

    private val tvCounter: TextView
        get() = findViewById(R.id.tvCounter)
    private val tvFact: TextView
        get() = findViewById(R.id.tvFact)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mutable_live_data)
        Log.d(TAG, "onCreate: MutableLiveDataActivity")
        mlvViewModel = ViewModelProvider(this).get(MlvViewModel::class.java)
        Toast.makeText(this, "Any outside component can update MutableLiveData's value", Toast.LENGTH_LONG).show()

        //now we need to observe our live data
        mlvViewModel.counterMLD.observe(this, Observer {
            tvCounter.text = it.toString()
        })

        mlvViewModel.factMLiveData.observe(this, Observer {
            tvFact.text = it
        })
    }

    fun incrementCounter(view: View) {
        mlvViewModel.incrementCounter()
    }

    fun updateFact(view: View) {
        mlvViewModel.updateLiveData()
    }

    fun goToLiveDataActivity(view: View) {
        startActivity(Intent(this, LiveDataActivity::class.java))
        finish()
    }
}