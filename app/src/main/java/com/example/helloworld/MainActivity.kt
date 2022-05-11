package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI:Button
    lateinit var btnsendmoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBmi)
        btnBMI.setOnClickListener {
            val intent = Intent(this,calculateBMIActivity::class.java)
            startActivity(intent)
        }
        setContentView(R.layout.activity_main)
        btnsendmoney = findViewById(R.id.btnsendmoney)
        btnsendmoney.setOnClickListener {
            val intent = Intent(this,SendMoneActivity::class.java)
            startActivity(intent)
        }
    }
}