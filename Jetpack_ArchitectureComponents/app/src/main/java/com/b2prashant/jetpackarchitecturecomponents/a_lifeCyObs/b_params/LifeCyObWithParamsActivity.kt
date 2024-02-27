package com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.b_params

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.c_defaultLifeCyObs.DefaultLifeCyObsActivity
import com.b2prashant.jetpackarchitecturecomponents.R

class LifeCyObWithParamsActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "LifeCyObWithParamsActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecy_ob_with_params)
        Toast.makeText(this,"LOActivity CREATION PHASE - OnCreate()" , Toast.LENGTH_SHORT).show()
        // adding lifecycle observer
        lifecycle.addObserver(LifeCyObsWithParams(this))
        Log.d(TAG, "LOActivity onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"LOActivity onStart()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LOActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"LOActivity onResume()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LOActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"LOActivity DESTRUCTION PHASE - onPause()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LOActivity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"LOActivity onStop()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LOActivity onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"LOActivity onDestroy()" , Toast.LENGTH_SHORT).show()
        Log.d(TAG, "LOActivity onDestroy()")
    }

    fun openDefaultLifeCyObActivity(view: View) {
        startActivity(Intent(this, DefaultLifeCyObsActivity::class.java))
        finish()
    }
}