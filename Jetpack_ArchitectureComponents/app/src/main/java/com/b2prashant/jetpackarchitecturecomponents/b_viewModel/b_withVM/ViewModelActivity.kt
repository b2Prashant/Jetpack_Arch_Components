package com.b2prashant.jetpackarchitecturecomponents.b_viewModel.b_withVM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.b2prashant.jetpackarchitecturecomponents.R
import com.b2prashant.jetpackarchitecturecomponents.b_viewModel.c_vmfactory.ViewModelFactoryActivity

class ViewModelActivity : AppCompatActivity() {

    private lateinit var tvCounter : TextView
    //declaring ViewModel
    private lateinit var myViewModel: MyViewModel

    companion object {
        private const val TAG = "ViewModelActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        Log.d(TAG, "ViewModelActivity onCreate()")
        tvCounter = findViewById(R.id.tvCounter)
        //getting VM object from ViewModelProvider and initializing
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java) //or
        //myViewModel = ViewModelProvider(this)[MyViewModel::class.java]
        Toast.makeText(this, "Fixed data loss issue on orientation change with VM help", Toast.LENGTH_LONG).show()
        setCountText()
    }

    fun setCountText() {
        tvCounter.text = myViewModel.count.toString()
    }

    fun incrementCounter(view: View){
        myViewModel.increment()
        setCountText()
    }

    fun openViewModelFactoryActivity(view: View) {
        startActivity(Intent(this, ViewModelFactoryActivity::class.java))
        finish()
    }
}