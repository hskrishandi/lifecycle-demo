package com.hskris.lifecycle_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Enter onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Enter onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LoginActivity.TAG, "Enter onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LoginActivity.TAG, "Enter onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LoginActivity.TAG, "Enter onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LoginActivity.TAG, "Enter onDestroy")
    }
}
