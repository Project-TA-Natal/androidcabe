package com.example.androidcabe

import android.R.id.home
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed


class Splashscreen : AppCompatActivity() {
    private val waktu_loading = 5000
    //5000=5 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({//Setelah loading maka akan langsung berpindah ke halaman login// }
        val Login= Intent(this@Splashscreen, Login::class.java)
        startActivity(Login)
        finish()
    }, waktu_loading.toLong())
}
}

