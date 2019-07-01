package com.hskris.lifecycle_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    companion object {
        val TAG = "RegisterActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Log.d(TAG, "Enter onCreate")

        btn_tologin.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Enter onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Enter onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Enter onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Enter onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Enter onDestroy")
    }
}
