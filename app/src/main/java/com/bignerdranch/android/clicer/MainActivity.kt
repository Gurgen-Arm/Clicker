package com.bignerdranch.android.clicer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private var count = 0
@SuppressLint("StaticFieldLeak")
private lateinit var Click: Button
@SuppressLint("StaticFieldLeak")
private lateinit  var Counter:TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Click = findViewById(R.id.Click)
        Counter = findViewById(R.id.Value)
        Click.setOnClickListener {
            count++
            Counter.setText(String.format("%d", count))

        }
    }
}