package com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.c_defaultLifeCyObs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.d_LCyEventObs.LifecycleEventObsActivity
import com.b2prashant.jetpackarchitecturecomponents.R

class DefaultLifeCyObsActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "DefaultLifeCyObsActivity"
    }
    //private lateinit var myDefaultLifeCyObs: MyDefaultLifeCyObs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default_life_cy_obs)
        Toast.makeText(this,"DLOActivity CREATION PHASE- OnCreate()" , Toast.LENGTH_SHORT).show()
        // adding lifecycle observer
        lifecycle.addObserver(MyDefaultLifeCyObs(this))
        Log.d(TAG, "DLOActivity onCreate()")
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"DLOActivity onStart()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "DLOActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"DLOActivity onResume()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "DLOActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"DLOActivity DESTRUCTION PHASE - onPause()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "DLOActivity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"DLOActivity onStop()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "DLOActivity onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"DLOActivity onDestroy()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "DLOActivity onDestroy()")
    }

    fun openLifeCyEventObsActivity(view: View) {
        startActivity(Intent(this, LifecycleEventObsActivity::class.java))
        finish()
    }
}