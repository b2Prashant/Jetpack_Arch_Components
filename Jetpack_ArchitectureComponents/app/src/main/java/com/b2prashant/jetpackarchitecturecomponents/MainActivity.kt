package com.b2prashant.jetpackarchitecturecomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.b2prashant.jetpackarchitecturecomponents.A_lifeCyObs.a_noParams.LifecycleObserverActivity
import com.b2prashant.jetpackarchitecturecomponents.C_liveData.a_mutableLD.MutableLiveDataActivity
import com.b2prashant.jetpackarchitecturecomponents.B_viewModel.a_withoutVM.WithoutViewModelActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }
    //private lateinit var btnNextActivity : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity onCreate()")
       /* btnNextActivity = findViewById(R.id.btnNextActivity)
        btnNextActivity.setOnClickListener {
            openLifeCycleObserverActivity()
        }*/
    }

    fun openLifeCycleObserverActivity(view: View) {
            var intent = Intent(this, LifecycleObserverActivity::class.java)
            //intent. putExtra("keyIdentifier", value)
            startActivity(intent)
    }
    fun openWithoutViewModelActivity(view: View) {
        startActivity(Intent(this, WithoutViewModelActivity::class.java).apply {
            putExtra("keyIdentifier", "text")
        })
    }
    fun openLiveDataActivity(view: View) {
        startActivity(Intent(this, MutableLiveDataActivity::class.java))
    }

}