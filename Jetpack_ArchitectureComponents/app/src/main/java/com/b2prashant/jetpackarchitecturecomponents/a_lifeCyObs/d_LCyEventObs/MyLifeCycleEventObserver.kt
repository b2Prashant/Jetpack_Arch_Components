package com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.d_LCyEventObs

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

internal class MyLifeCycleEventObserver: LifecycleEventObserver {

    companion object{
        private const val  TAG = "MyLifeCycleEventObserver"
    }
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                Log.d(TAG,"ON_CREATE" )
                Toast.makeText(source as Context,"LEObserver ON_CREATE" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_START -> {
                Log.d(TAG,"ON_START" )
                Toast.makeText(source as Context,"LEObserver ON_START" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_RESUME -> {
                Log.d(TAG,"ON_RESUME" )
                Toast.makeText(source as Context,"LEObserver ON_RESUME" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_PAUSE -> {
                Log.d(TAG,"ON_PAUSE" )
                Toast.makeText(source as Context,"LEObserver ON_PAUSE" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_STOP -> {
                Log.d(TAG,"on stop" )
                Toast.makeText(source as Context,"LEObserver ON_STOP" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_DESTROY -> {
                Log.d(TAG,"on destroy" )
                Toast.makeText(source as Context,"LEObserver ON_DESTROY" , Toast.LENGTH_SHORT).show()
            }
            Lifecycle.Event.ON_ANY -> {
                Log.d(TAG,"on any" )
                Toast.makeText(source as Context,"LEObserver ON_ANY" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}