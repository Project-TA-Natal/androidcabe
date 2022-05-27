package com.example.androidcabe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class Splashscreen : AppCompatActivity() {
    private val times = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            val toLogin = Intent(this@Splashscreen, Login::class.java)
            startActivity(toLogin)
            finish()
        }, times.toLong())
    }
}

