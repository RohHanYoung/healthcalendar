package com.example.healthcalender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {

    lateinit var cal : CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cal = findViewById<CalendarView>(R.id.calendarView)

        cal.setOnDateChangeListener { calendarView, i, i2, i3 ->
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

    }
}