package com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.d_LCyEventObs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.b2prashant.jetpackarchitecturecomponents.R

class LifecycleEventObsActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "LifecycleEventObsActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_event_obs)
        Toast.makeText(this,"LEOActivity CREATION PHASE- OnCreate()" , Toast.LENGTH_SHORT).show()
        // adding lifecycle observer
        lifecycle.addObserver(MyLifeCycleEventObserver())
        Log.d(TAG, "LEOActivity onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"LEOActivity onStart()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LEOActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"LEOActivity onResume()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LEOActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"LEOActivity DESTRUCTION PHASE - onPause()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LEOActivity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"LEOActivity onStop()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LEOActivity onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"LEOActivity onDestroy()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LEOActivity onDestroy()")
    }
}