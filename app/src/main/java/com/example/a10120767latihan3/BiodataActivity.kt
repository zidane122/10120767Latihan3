package com.example.a10120767latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BiodataActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonBio : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        buttonBio = findViewById(R.id.btn_bio)

        buttonBio.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_bio ->{
                val intent = Intent(this@BiodataActivity, KodeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}