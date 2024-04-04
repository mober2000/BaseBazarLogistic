package com.example.basebazarlogistic.calculators

import android.app.Activity
import android.util.Log
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class CoastsProductAndDelivery(activity: Activity) {

    val buttons = Buttons(activity)
    val textViews = TextViews(activity)
    fun calculateRubbleCoastProduct(){
        val courseYuan = buttons.courseYuanButton.text.toString().toDoubleOrNull() ?: 0.0
        val priceYuanProduct = buttons.priceYuanProductButton.text.toString().toDoubleOrNull() ?: 0.0
        val rubbleCoast = courseYuan * priceYuanProduct

        // Логирование
        Log.d("CoastsProductAndDelivery", "Курс юаня: $courseYuan, Цена в юанях: $priceYuanProduct, Стоимость в рублях: $rubbleCoast")

        textViews.rubbleCoastProductText.text = rubbleCoast.toString()
    }

    fun calculateDollarCoastProduct() {
        val courseDollar = buttons.courseDollarButton.text.toString().toDoubleOrNull() ?: 0.0
        // Возможно, вы хотели получить текст из TextView и преобразовать его в Double
        val rubbleCoastProduct = textViews.rubbleCoastProductText.text.toString().toDoubleOrNull() ?: 0.0
        val dollarCoast = rubbleCoastProduct / courseDollar

        // Округляем до десятых
        val formattedDollarCoast = String.format("%.1f", dollarCoast)

        // Логирование
        Log.d("CoastsProductAndDelivery", "Курс доллара: $courseDollar, Стоимость в рублях: $rubbleCoastProduct, Стоимость в долларах: $formattedDollarCoast")

        textViews.dollarCoastProductText.text = formattedDollarCoast
    }
}
