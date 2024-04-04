package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basebazarlogistic.calculators.CoastsProductAndDelivery
import com.example.basebazarlogistic.calculators.Packs
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
        val coastsProductAndDelivery = CoastsProductAndDelivery(this)
        val packs = Packs(this)

        // Устанавливаем обработчик нажатия на кнопку
        buttons.pressButton.setOnClickListener {
            volumeAndDestiny.calculateVolume()
            volumeAndDestiny.calculateDestiny()

            coastsProductAndDelivery.calculateRubbleCoastProduct()
            coastsProductAndDelivery.calculateDollarCoastProduct()

            packs.calculatePackWeightText()
            packs.calculateAllWeightPack()

            // Ваш код, который выполнится при нажатии на кнопку
            Toast.makeText(this, "Посчитали", Toast.LENGTH_SHORT).show()

        }

        buttons.dropDownPack()
        buttons.dropDownCategory()
        buttons.dropDeliverySpeed()
    }
}
