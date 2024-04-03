package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
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
        var inputWeight: EditText = findViewById(R.id.inputWeight)
        var destinyText = findViewById<TextView>(R.id.destinySum)

        pressButton.setOnClickListener {
            val length = lengthButton.text.toString().toDoubleOrNull() ?: 0.0
            val width = widthButton.text.toString().toDoubleOrNull() ?: 0.0
            val height = heightButton.text.toString().toDoubleOrNull() ?: 0.0
            val weightOneBox = inputWeight.text.toString().toDoubleOrNull() ?: 0.0

            val volume = length * width * height

            // Форматируем результат до стотысячных и считаем обьем
            val formattedVolume = String.format("%.5f", volume)

            volumeResultSum.text = formattedVolume

            // Рассчитываем destiny (плотность)
            val destiny = if (volume != 0.0) {
                weightOneBox / volume
            } else {
                0.0 // Если объём равен 0, ставим плотность в 0
            }

            // Форматируем значение destiny до стотысячных и выводим
            val formattedDestiny = String.format("%.5f", destiny)
            destinyText.text = formattedDestiny

        }

        // Получаем ссылку на Spinner по его id
        val spinner: Spinner = findViewById(R.id.spinner)
        // Массив строк для отображения в списке
        val options = arrayOf("Хозтовары", "Одежда", "Электроника", "Poizon")
        // Создаем адаптер
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        // Устанавливаем ресурс макета для выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Устанавливаем адаптер для выпадающего списка
        spinner.adapter = adapter
    }
}