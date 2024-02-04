package com.b2prashant.jetpackarchitecturecomponents.A_lifecycleObserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.b2prashant.jetpackarchitecturecomponents.R

class LifecycleObserverActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "LifecycleObserverActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_observer)
        lifecycle.addObserver(MyObserver())
        Log.d(TAG, "LifecycleObserverActivity onCreate()")
    }
}