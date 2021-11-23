package com.example.devapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        var timer = object : CountDownTimer(3000, 1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }
        timer.start()
    }
}