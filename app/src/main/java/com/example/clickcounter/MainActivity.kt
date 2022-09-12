package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton: Button = findViewById(R.id.button)
        var c=0
        clickButton.setOnClickListener {
            c+=1
            clicks(c)

        }
        var resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener {
            c=0
            clicks(c)
        }
    }
    private fun clicks(c: Int){
        val textClicks: TextView = findViewById(R.id.textView)

        textClicks.setText(Integer.toString(c))

    }
}