package com.hskris.lifecycle_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {

    companion object {
        val TAG = "LoginActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Enter onCreate")
        setContentView(R.layout.activity_login)
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
