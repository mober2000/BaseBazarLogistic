package com.example.basebazarlogistic.calculators

import android.app.Activity
import android.util.Log
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class VolumeAndDestiny (private val activity: Activity){
    val buttons = Buttons(activity)
    val textViews = TextViews(activity)

    fun calculateVolume() {
        val length = buttons.lengthButton.text.toString().toDoubleOrNull() ?: 0.0
        val width = buttons.widthButton.text.toString().toDoubleOrNull() ?: 0.0
        val height = buttons.heightButton.text.toString().toDoubleOrNull() ?: 0.0

        val volume = length * width * height
        val formattedVolume = String.format("%.5f", volume)

        textViews.volumeText.text = formattedVolume

        Log.d("CalculateVolume", "Length: $length, Width: $width, Height: $height")
        Log.d("CalculateVolume", "Volume calculated: $formattedVolume")
    }
    fun calculateDestiny(){
        val volumeText = textViews.volumeText.text.toString().toDoubleOrNull() ?: 0.0
        val oneBoxWeight = buttons.oneBoxWeightButton.text.toString().toDoubleOrNull() ?: 0.0

        val destiny = oneBoxWeight / volumeText
        val formattedDestiny = String.format("%.5f", destiny)

        textViews.destinyText.text = formattedDestiny

        Log.d("CalculateDestiny", "Volume text: $volumeText, One box weight: $oneBoxWeight")
        Log.d("CalculateDestiny", "Destiny calculated: $formattedDestiny")
    }
}