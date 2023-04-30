package com.example.a10120767latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnMasuk = findViewById(R.id.btnmsk)

        btnMasuk.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnmsk ->{
                val intent = Intent(this@LoginActivity, BiodataActivity::class.java)
                startActivity(intent)
            }
        }
    }
}