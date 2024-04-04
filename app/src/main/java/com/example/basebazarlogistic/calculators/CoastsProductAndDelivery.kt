package com.example.basebazarlogistic.calculators

import android.app.Activity
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class CoastsProductAndDelivery(activity: Activity) {

    val buttons = Buttons(activity)
    val textViews = TextViews(activity)
    fun calculateRubbleCoastProduct(){
        val courseYuan = buttons.courseYuanButton.text.toString().toDoubleOrNull() ?: 0.0
        val priceYuanProduct = buttons.priceYuanProductButton.text.toString().toDoubleOrNull() ?: 0.0

        val rubbleCoast = courseYuan * priceYuanProduct
        textViews.rubbleCoastProductText.text = rubbleCoast.toString()
    }
    fun calculateDollarCoastProduct() {
        val courseDollar = buttons.courseDollarButton.text.toString().toDoubleOrNull() ?: 0.0
        val rubbleCoastProduct = textViews.rubbleCoastProductText.text.toString().toDoubleOrNull() ?: 0.0

        val dollarCoast = rubbleCoastProduct / courseDollar

        // Округляем до десятых
        val formattedDollarCoast = String.format("%.1f", dollarCoast)
        textViews.dollarCoastProductText.text = formattedDollarCoast
    }
}