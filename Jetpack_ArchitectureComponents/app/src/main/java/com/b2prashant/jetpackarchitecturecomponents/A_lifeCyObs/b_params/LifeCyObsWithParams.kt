package com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.b_params

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifeCyObsWithParams(private val mContext: Context): LifecycleObserver {
    companion object {
        private const val TAG = "LifeCyObsWithParams"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d(TAG, "LObserver onCreate()")
        Toast.makeText(mContext,"LObserver onCreate()" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d(TAG, "LObserver onStart()")
        Toast.makeText(mContext,"LObserver onStart()" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d(TAG, "LObserver onResume()")
        Toast.makeText(mContext,"LObserver onResume()" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d(TAG, "LObserver onPause()")
        Toast.makeText(mContext,"LObserver onPause()" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d(TAG, "LObserver onStop()")
        Toast.makeText(mContext,"LObserver onStop()" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d(TAG, "LObserver onDestroy()")
        Toast.makeText(mContext,"LObserver onDestroy()" , Toast.LENGTH_SHORT).show()
    }
}