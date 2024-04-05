package com.example.basebazarlogistic

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basebazarlogistic.calculators.WeightProduct
import com.example.basebazarlogistic.methods.PreOrderCalculateMethods
import com.example.basebazarlogistic.ui.Buttons

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
        val preOrderCalculateMethods = PreOrderCalculateMethods(this)

        // Устанавливаем обработчик нажатия на кнопку
        buttons.pressButton.setOnClickListener {
            preOrderCalculateMethods.calculateVolumeAndDestiny()
            preOrderCalculateMethods.calculateCoastProduct()
            preOrderCalculateMethods.calculatePack()
            preOrderCalculateMethods.calculateWeight()
            preOrderCalculateMethods.calculateTariffDelivery()


            // Ваш код, который выполнится при нажатии на кнопку
            Toast.makeText(this, "Посчитали", Toast.LENGTH_SHORT).show()

        }
        buttons.dropDownPack()
        buttons.dropDownCategory()
        buttons.dropDeliverySpeed()
    }
}
