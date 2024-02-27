package com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.c_defaultLifeCyObs

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyDefaultLifeCyObs(private val mContext: Context): DefaultLifecycleObserver {
    companion object {
        private const val TAG = "MyDefaultLifeCyObs"
    }
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(TAG, "DLObserver onCreate()")
        Toast.makeText(mContext,"DLObserver onCreate()" , Toast.LENGTH_SHORT).show()
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(TAG, "DLObserver onStart()")
        Toast.makeText(mContext,"DLObserver onStart()" , Toast.LENGTH_SHORT).show()
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(TAG, "DLObserver onResume()")
        Toast.makeText(mContext,"DLObserver onResume()" , Toast.LENGTH_SHORT).show()
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d(TAG, "DLObserver onPause()")
        Toast.makeText(mContext,"DLObserver onPause()" , Toast.LENGTH_SHORT).show()
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d(TAG, "DLObserver onStop()")
        Toast.makeText(mContext,"DLObserver onStop()" , Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d(TAG, "DLObserver onDestroy()")
        Toast.makeText(mContext,"DLObserver onDestroy()" , Toast.LENGTH_SHORT).show()
    }
}