package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var topText = findViewById<TextView>(R.id.textView)
        var volumeResultText = findViewById<TextView>(R.id.volumeResult)
        var volumeResultSum = findViewById<TextView>(R.id.volumeSum)
        var lengthButton: EditText = findViewById(R.id.inputLenght)
        var widthButton: EditText = findViewById(R.id.inputWidth)
        var heightButton: EditText = findViewById(R.id.inputHeight)
        var pressButton: Button = findViewById(R.id.calculateButton)

        pressButton.setOnClickListener {
            val length = lengthButton.text.toString().toDoubleOrNull() ?: 0.0
            val width = widthButton.text.toString().toDoubleOrNull() ?: 0.0
            val height = heightButton.text.toString().toDoubleOrNull() ?: 0.0

            Log.d("MainActivity", "Length: $length")
            Log.d("MainActivity", "Width: $width")
            Log.d("MainActivity", "Height: $height")

            val volume = length * width * height

            Log.d("MainActivity", "Volume: $volume")

            // Форматируем результат до стотысячных
            val formattedVolume = String.format("%.5f", volume)

            volumeResultSum.text = formattedVolume

        }
    }
}