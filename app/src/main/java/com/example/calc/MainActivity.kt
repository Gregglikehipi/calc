package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var currentVal = ""
        var storedVal = ""
        var status = 0
        val textView: TextView = findViewById(R.id.output) as TextView

        findViewById<Button>(R.id.button_1)
            .setOnClickListener {
                currentVal += "1"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_2)
            .setOnClickListener {
                currentVal += "2"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_3)
            .setOnClickListener {
                currentVal += "3"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_4)
            .setOnClickListener {
                currentVal += "4"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_5)
            .setOnClickListener {
                currentVal += "5"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_6)
            .setOnClickListener {
                currentVal += "6"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_7)
            .setOnClickListener {
                currentVal += "7"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_8)
            .setOnClickListener {
                currentVal += "8"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_9)
            .setOnClickListener {
                currentVal += "9"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_0)
            .setOnClickListener {
                currentVal += "0"
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_clear)
            .setOnClickListener {
                currentVal = ""
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_plus)
            .setOnClickListener {
                storedVal = currentVal
                currentVal = ""
                status = 0
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_minus)
            .setOnClickListener {
                storedVal = currentVal
                currentVal = ""
                status = 1
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_multiply)
            .setOnClickListener {
                storedVal = currentVal
                currentVal = ""
                status = 2
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_divide)
            .setOnClickListener {
                storedVal = currentVal
                currentVal = ""
                status = 3
                textView.text = currentVal.toString()
            }
        findViewById<Button>(R.id.button_equal)
            .setOnClickListener {
                when (status) {
                    0 -> currentVal = (storedVal.toInt()+currentVal.toInt()).toString()
                    1 -> currentVal = (storedVal.toInt()-currentVal.toInt()).toString()
                    2 -> currentVal = (storedVal.toInt()*currentVal.toInt()).toString()
                    3 -> currentVal = (storedVal.toInt()/currentVal.toInt()).toString()
                }
                textView.text = currentVal.toString()
            }
    }

}