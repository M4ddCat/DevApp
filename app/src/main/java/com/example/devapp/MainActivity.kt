package com.example.devapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_activity)
    }

    fun login(view: android.view.View) {
        startActivity(Intent(this@MainActivity, SignInActivity::class.java))
    }
}

