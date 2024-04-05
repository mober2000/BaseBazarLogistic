package com.example.basebazarlogistic.calculators

import android.app.Activity
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class WeightProduct (val activity: Activity) {
    val buttons = Buttons(activity)
    val textViews = TextViews(activity)

    fun calculateProductWeightNotPack(){
        val numberBoxesProduct = buttons.numberBoxesProductButton.text.toString().toDoubleOrNull() ?: 0.0
        val oneBoxWeight = buttons.oneBoxWeightButton.text.toString().toDoubleOrNull() ?: 0.0

        val productWeightNotPack = numberBoxesProduct * oneBoxWeight
        val formattedWeight = String.format("%.5f", productWeightNotPack)

        textViews.weightProductNotPackText.text = formattedWeight
    }

    fun calculateProductWeightHasPack(){
        val weightProductNotPack = textViews.weightProductNotPackText.text.toString().toDoubleOrNull() ?: 0.0
        val weightAllPack = textViews.weightAllPackText.text.toString().toDoubleOrNull() ?: 0.0

        val productWeightHasPack = weightProductNotPack + weightAllPack
        val formattedWeight = String.format("%.5f", productWeightHasPack)

        textViews.weightProductHasPackText.text = formattedWeight
    }

}