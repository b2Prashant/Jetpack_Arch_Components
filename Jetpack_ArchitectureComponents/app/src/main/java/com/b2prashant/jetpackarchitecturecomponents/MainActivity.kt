package com.b2prashant.jetpackarchitecturecomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.b2prashant.jetpackarchitecturecomponents.databinding.DataBindingActivity
import com.b2prashant.jetpackarchitecturecomponents.databinding_livedata.LiveDataBindingActivity
import com.b2prashant.jetpackarchitecturecomponents.lifecycleObserver.LifecycleObserverActivity
import com.b2prashant.jetpackarchitecturecomponents.livedata.LiveDataActivity
import com.b2prashant.jetpackarchitecturecomponents.livedata.MutableLiveDataActivity
import com.b2prashant.jetpackarchitecturecomponents.viewmodel.WithoutViewModelActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    //private lateinit var btnNextActivity : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity onCreate()")
       /* btnNextActivity = findViewById(R.id.btnNextActivity)
        btnNextActivity.setOnClickListener {
            openLifeCycleObserverActivity()
        }*/
    }

    fun openLifeCycleObserverActivity() {
        var intent = Intent(this, LifecycleObserverActivity::class.java)
        //intent. putExtra("keyIdentifier", value)
        startActivity(intent)
    }

    fun openWithoutViewModelActivity(view: View) {
        startActivity(Intent(this, WithoutViewModelActivity::class.java).apply {
            putExtra("keyIdentifier", "text")
        })
    }

    fun openLiveDataActivity(view: View) {
        startActivity(Intent(this, MutableLiveDataActivity::class.java))
    }

    fun openDataBindingActivity(view: View) {
        startActivity(Intent(this, DataBindingActivity::class.java))
    }
    fun openLiveDataBindingActivity(view: View) {
        startActivity(Intent(this, LiveDataBindingActivity::class.java))
    }

}