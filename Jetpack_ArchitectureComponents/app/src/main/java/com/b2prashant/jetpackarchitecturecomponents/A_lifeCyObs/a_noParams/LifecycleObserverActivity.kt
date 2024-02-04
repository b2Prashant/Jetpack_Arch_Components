package com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.a_noParams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.b_params.LifeCyObWithParamsActivity
import com.b2prashant.jetpackarchitecturecomponents.R

class LifecycleObserverActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "LifecycleObserverActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_observer)
        // adding lifecycle observer
        lifecycle.addObserver(MyLifecycleObserver())
        Log.d(TAG, "LifecycleObserverActivity onCreate()")
        Toast.makeText(this,"In Creation Phase First Activity's methods get called" , Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        Toast.makeText(this,"In destruction Phase First Observer's methods get called" , Toast.LENGTH_LONG).show()
        super.onPause()
    }

    fun openLifeCyObWithPrimaryConstructor(view: View) {
        startActivity(Intent(this, LifeCyObWithParamsActivity::class.java))
        finish()
    }
}