package com.example.devapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_activity)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view: android.view.View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
        {
            startActivity(Intent(this@SignInActivity, SplashActivity::class.java))
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}