package com.b2prashant.jetpackarchitecturecomponents.A_lifecycleObserver.a_withoutParams

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver: LifecycleObserver {
    companion object {
        private const val TAG = "MyObserver"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d(TAG, "MyObserver onCreate() get called")
    }

}