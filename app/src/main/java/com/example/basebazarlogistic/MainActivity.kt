package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
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

        var lengthButton: EditText = findViewById(R.id.length)
        var widthButton: EditText = findViewById(R.id.width)
        var heightButton: EditText = findViewById(R.id.heigth)
        var oneBoxWeightButton: EditText = findViewById(R.id.weigth_one_box)
        var courseYuanButton: EditText = findViewById(R.id.yuan_course)
        var priceYuanProductButton: EditText = findViewById(R.id.yuan_product_price)
        var courseDollarButton: EditText = findViewById(R.id.dollar_course)
        var numberBoxesButton: EditText = findViewById(R.id.number_boxes)
        var numberPlaceButton: EditText = findViewById(R.id.number_place_pack)

        var volumeText = findViewById<TextView>(R.id.volume_value)
        var destinyText = findViewById<TextView>(R.id.destiny_value)
        var rubbleCoastProductText = findViewById<TextView>(R.id.coast_rubles_product_value)
        var dollarCoastProductText = findViewById<TextView>(R.id.coast_dollars_product_value)



        fun calculateVolume() {
            val length = lengthButton.text.toString().toDoubleOrNull() ?: 0.0
            val width = widthButton.text.toString().toDoubleOrNull() ?: 0.0
            val height = heightButton.text.toString().toDoubleOrNull() ?: 0.0

            val volume = length * width * height
            val formattedVolume = String.format("%.5f", volume)

            volumeText.text = formattedVolume

            Log.d("CalculateVolume", "Length: $length, Width: $width, Height: $height")
            Log.d("CalculateVolume", "Volume calculated: $formattedVolume")
        }
        fun calculateDestiny(){
            val volumeText = volumeText.text.toString().toDoubleOrNull() ?: 0.0
            val oneBoxWeight = oneBoxWeightButton.text.toString().toDoubleOrNull() ?: 0.0

            val destiny = oneBoxWeight / volumeText
            val formattedDestiny = String.format("%.5f", destiny)

            destinyText.text = formattedDestiny

            Log.d("CalculateDestiny", "Volume text: $volumeText, One box weight: $oneBoxWeight")
            Log.d("CalculateDestiny", "Destiny calculated: $formattedDestiny")
        }
        fun calculateRubbleCoastProduct(){
            val courseYuan = courseYuanButton.text.toString().toDoubleOrNull() ?: 0.0
            val priceYuanProduct = priceYuanProductButton.text.toString().toDoubleOrNull() ?: 0.0

            var rubbleCoast = courseYuan * priceYuanProduct
            rubbleCoastProductText.text = rubbleCoast.toString()
        }
        fun calculateDollarCoastProduct() {
            val courseDollar = courseDollarButton.text.toString().toDoubleOrNull() ?: 0.0
            var rubbleCoastProduct = rubbleCoastProductText.text.toString().toDoubleOrNull() ?: 0.0

            var dollarCoast = rubbleCoastProduct / courseDollar

            // Округляем до десятых
            val formattedDollarCoast = String.format("%.1f", dollarCoast)
            dollarCoastProductText.text = formattedDollarCoast
        }
        fun dropDownPack(){
            // Получаем ссылку на Spinner по его id
            val spinner: Spinner = findViewById(R.id.pack)
            // Массив строк для отображения в списке
            val options = arrayOf("Скотч", "Бумажная обрешетка", "Деревянная обрешетка", "Палет")
            // Создаем адаптер
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            // Устанавливаем ресурс макета для выпадающего списка
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Устанавливаем адаптер для выпадающего списка
            spinner.adapter = adapter
        }
        fun dropDownCategory(){
            // Получаем ссылку на Spinner по его id
            val spinner: Spinner = findViewById(R.id.category)
            // Массив строк для отображения в списке
            val options = arrayOf("Хозтовары", "Одежда", "Электроника", "Poizon")
            // Создаем адаптер
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            // Устанавливаем ресурс макета для выпадающего списка
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Устанавливаем адаптер для выпадающего списка
            spinner.adapter = adapter
        }
        fun dropDeliverySpeed(){
            // Получаем ссылку на Spinner по его id
            val spinner: Spinner = findViewById(R.id.delivery_speed)
            // Массив строк для отображения в списке
            val options = arrayOf("Быстрая 12-15 дней", "Долгая 18-23 дня")
            // Создаем адаптер
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            // Устанавливаем ресурс макета для выпадающего списка
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Устанавливаем адаптер для выпадающего списка
            spinner.adapter = adapter
        }

        var pressButton: Button = findViewById(R.id.calculate_button)

        // Устанавливаем обработчик нажатия на кнопку
        pressButton.setOnClickListener {
            calculateVolume()
            calculateDestiny()
            calculateRubbleCoastProduct()
            calculateDollarCoastProduct()


            // Ваш код, который выполнится при нажатии на кнопку
            Toast.makeText(this, "Посчитали", Toast.LENGTH_SHORT).show()

        }

        dropDownPack()
        dropDownCategory()
        dropDeliverySpeed()
    }
}
