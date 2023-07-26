package com.waudeshindumina.agecalculator

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe: Button = findViewById(R.id.buttonBirthday)
        btnClickMe.setOnClickListener {
            Toast.makeText(this, "Your click the button", Toast.LENGTH_SHORT).show()
        }
    }

        @RequiresApi(Build.VERSION_CODES.N)
        fun datePicker(){

            var calentar = Calendar.getInstance()
            var year = calentar.get(Calendar.YEAR)
            var month = calentar.get(Calendar.MONTH)
            var dayofMonth = calentar.get(Calendar.DAY_OF_MONTH)

                DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view,year,month,dayofMonth-> },year,month,dayofMonth)



    }
}