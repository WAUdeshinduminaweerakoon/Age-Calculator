package com.waudeshindumina.agecalculator

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Locale

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe: Button = findViewById(R.id.buttonBirthday)
        btnClickMe.setOnClickListener {view ->

            datePicker(view)
            //Toast.makeText(this, "Your click the button", Toast.LENGTH_SHORT).show()
        }
    }

        @RequiresApi(Build.VERSION_CODES.N)
        fun datePicker(view: View){

            val calentar = Calendar.getInstance()
            val year = calentar.get(Calendar.YEAR)
            val month = calentar.get(Calendar.MONTH)
            val dayofMonth = calentar.get(Calendar.DAY_OF_MONTH)


                DatePickerDialog(this,DatePickerDialog.OnDateSetListener {view,year,month,dayofMonth->
                   // Toast.makeText(this,"This is $year/${1+month}/$dayofMonth",Toast.LENGTH_SHORT).show()
                    val selectorDat = "$dayofMonth/${1+month}/$year"
                    inSelectedDayText.text = selectorDat

                    val simpleDate = SimpleDateFormat("dd/mm/yyyy",Locale.ENGLISH)
                    val date = simpleDate.parse(selectorDat)

                    val seconds = date!!.time/1000

                    val todateInSeconds = simpleDate.parse(simpleDate.format(System.currentTimeMillis()))!!.time/1000
                    val trueTimeInSeconds = todateInSeconds-seconds

                    inSecondsText.text = "$trueTimeInSeconds s"
                    inMinutesText.text = "${trueTimeInSeconds/60} M"
                    inHoursText.text = "${trueTimeInSeconds/60/60} hrs"
                    inDaysText.text = "${trueTimeInSeconds/86400}day "





                },year,month,dayofMonth).show()



    }
}
