package com.example.basebazarlogistic

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Buttons : AppCompatActivity() {
    var topText = findViewById<TextView>(R.id.textView)
    var volumeResultText = findViewById<TextView>(R.id.volumeResult)
    var volumeResultSum = findViewById<TextView>(R.id.volumeSum)
    var lengthButton: EditText = findViewById(R.id.inputLenght)
    var widthButton: EditText = findViewById(R.id.inputWidth)
    var heightButton: EditText = findViewById(R.id.inputHeight)
    var pressButton: Button = findViewById(R.id.calculateButton)
    var inputWeight: EditText = findViewById(R.id.inputWeight)
    var destinyText = findViewById<TextView>(R.id.destinySum)
}