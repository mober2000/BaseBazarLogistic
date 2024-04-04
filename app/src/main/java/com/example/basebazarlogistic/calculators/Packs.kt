package com.example.basebazarlogistic.calculators

import android.app.Activity
import android.util.Log
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class Packs (activity: Activity){
    val buttons = Buttons(activity)
    val textViews = TextViews(activity)

    fun calculatePackWeightText(){
        val pack = buttons.pack.selectedItem.toString()

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
    fun calculateCoastPack(){
        val courseDollar = buttons.courseDollarButton.text.toString().toDoubleOrNull() ?: 0.0
        val pack = buttons.pack.selectedItem.toString()

        val coastPack: Double = when (pack) {
            "Скотч" -> 5 * courseDollar
            "Бумажная обрешетка" -> 10 * courseDollar
            "Деревянная обрешетка" -> 15 * courseDollar
            "Палет" -> 40 * courseDollar
            else -> error("Неизвестный материал") // Может быть изменено на другое значение по умолчанию, если необходимо
        }
        textViews.coastOnePackText.text = coastPack.toString()
    }
    fun calculateCoastSumPack(){

    }
}