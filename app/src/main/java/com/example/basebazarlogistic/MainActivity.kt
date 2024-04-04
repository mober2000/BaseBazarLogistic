package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basebazarlogistic.calculators.VolumeAndDestiny
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews


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

        val buttons = Buttons(this)
        val textViews = TextViews(this)
        val volumeAndDestiny = VolumeAndDestiny(this)




        fun calculateRubbleCoastProduct(){
            val courseYuan = buttons.courseYuanButton.text.toString().toDoubleOrNull() ?: 0.0
            val priceYuanProduct = buttons.priceYuanProductButton.text.toString().toDoubleOrNull() ?: 0.0

            var rubbleCoast = courseYuan * priceYuanProduct
            textViews.rubbleCoastProductText.text = rubbleCoast.toString()
        }
        fun calculateDollarCoastProduct() {
            val courseDollar = buttons.courseDollarButton.text.toString().toDoubleOrNull() ?: 0.0
            var rubbleCoastProduct = textViews.rubbleCoastProductText.text.toString().toDoubleOrNull() ?: 0.0

            var dollarCoast = rubbleCoastProduct / courseDollar

            // Округляем до десятых
            val formattedDollarCoast = String.format("%.1f", dollarCoast)
            textViews.dollarCoastProductText.text = formattedDollarCoast
        }
        fun calculatePackWeightText(){
            val spinner: Spinner = findViewById(R.id.pack)
            val pack = spinner.selectedItem.toString()

            val weightProductValue: Int = when (pack) {
                "Скотч" -> 1
                "Бумажная обрешетка" -> 2
                "Деревянная обрешетка" -> 5
                "Палет" -> 80
                else -> error("Неизвестный материал") // Может быть изменено на другое значение по умолчанию, если необходимо
            }
// Устанавливаем значение веса одной упаковки в TextView
            textViews.weightOnePackText.text = weightProductValue.toString()
        }
        fun calculateAllWeightPack(){

            val numberPlacePack = buttons.numberPlacePackButton.text.toString().toDoubleOrNull() ?: 0.0
            val weightOnePack = textViews.weightOnePackText.text.toString().toDoubleOrNull() ?: 0.0

            Log.d("MainActivity", "numberPlacePack: $numberPlacePack")
            Log.d("MainActivity", "weightOnePack: $weightOnePack")

            val weightAll = numberPlacePack * weightOnePack

            Log.d("MainActivity", "weightAll: $weightAll")

            textViews.weightAllPackText.text = weightAll.toString()


        }

        var pressButton: Button = findViewById(R.id.calculate_button)

        // Устанавливаем обработчик нажатия на кнопку
        pressButton.setOnClickListener {
            volumeAndDestiny.calculateVolume()
            volumeAndDestiny.calculateDestiny()
            calculateRubbleCoastProduct()
            calculateDollarCoastProduct()
            calculatePackWeightText()
            calculateAllWeightPack()



            // Ваш код, который выполнится при нажатии на кнопку
            Toast.makeText(this, "Посчитали", Toast.LENGTH_SHORT).show()

        }

        buttons.dropDownPack()
        buttons.dropDownCategory()
        buttons.dropDeliverySpeed()
    }
}
