package com.waudeshindumina.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe : Button = findViewById(R.id.buttonBirthday)
        btnClickMe.setOnClickListener {
            Toast.makeText(this,"Your click the button",Toast.LENGTH_SHORT).show()
        }
    }
}