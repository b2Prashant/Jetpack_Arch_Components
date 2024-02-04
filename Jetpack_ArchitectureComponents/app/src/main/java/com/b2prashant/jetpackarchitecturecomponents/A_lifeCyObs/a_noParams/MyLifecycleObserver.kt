package com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.a_noParams

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLifecycleObserver: LifecycleObserver {
    companion object {
        private const val TAG = "MyLifecycleObserver"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d(TAG, "MyLifecycleObserver onCreate()")
    }

}