package com.b2prashant.jetpackarchitecturecomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.b2prashant.jetpackarchitecturecomponents.a_lifeCyObs.a_noParams.LifecycleObserverActivity
import com.b2prashant.jetpackarchitecturecomponents.c_liveData.a_mutableLD.MutableLiveDataActivity
import com.b2prashant.jetpackarchitecturecomponents.b_viewModel.a_withoutVM.WithoutViewModelActivity
import com.b2prashant.jetpackarchitecturecomponents.d_viewBinding.E_dataBinding.DataBindgOneWActivity
import com.b2prashant.jetpackarchitecturecomponents.d_viewBinding.a_vb.MyViewBindingActivity
import com.b2prashant.jetpackarchitecturecomponents.f_bindgAdaptrs.CustomDBActivity

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

    fun openViewBindingActivity(view: View) {
        startActivity(Intent(this, MyViewBindingActivity::class.java))
    }

    fun openDataBindingActivity(view: View) {
        startActivity(Intent(this, DataBindgOneWActivity::class.java))
    }

    fun openCustomDBActivity(view: View) {
        startActivity(Intent(this, CustomDBActivity::class.java))
    }

}