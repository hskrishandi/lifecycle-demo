package com.hskris.lifecycle_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        val TAG = "LoginActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Enter onCreate")
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val username = edittext_username.text.toString()
            val password = edittext_password.text.toString()

            if(username == "hans" && password == "1234"){
                login()
            } else {
                Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show()
            }

        }
    }

    fun login(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
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
