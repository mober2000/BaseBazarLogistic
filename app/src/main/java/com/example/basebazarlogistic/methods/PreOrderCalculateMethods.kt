package com.example.basebazarlogistic.methods

import Tariff
import android.app.Activity
import com.example.basebazarlogistic.calculators.CoastsProductAndDelivery
import com.example.basebazarlogistic.calculators.Packs
import com.example.basebazarlogistic.calculators.VolumeAndDestiny
import com.example.basebazarlogistic.calculators.WeightProduct
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class PreOrderCalculateMethods(private val activity: Activity) {
    var packs = Packs(activity)
    var volumeAndDestiny = VolumeAndDestiny(activity)
    var coastsProductAndDelivery = CoastsProductAndDelivery(activity)
    var tariff = Tariff(activity)
    val buttons = Buttons(activity)
    val textViews = TextViews(activity)
    val weightProduct = WeightProduct(activity)

    fun calculateVolumeAndDestiny(){
        volumeAndDestiny.calculateVolume()
        volumeAndDestiny.calculateDestiny()
    }

    fun calculatePack(){
        packs.calculatePackWeightText()
        packs.calculateAllWeightPack()
        packs.calculateCoastPack()
        packs.calculateCoastSumPack()
        packs.calculateUnloadCoast()
    }

    fun calculateCoastProduct(){
        coastsProductAndDelivery.calculateRubbleCoastProduct()
        coastsProductAndDelivery.calculateDollarCoastProduct()
    }
    fun calculateTariffDelivery() {
        textViews.tariffKgDollarText.text = tariff.calculateTariffCoast(
            buttons.category.selectedItem.toString(),
            buttons.delivery_speed.selectedItem.toString(),
            textViews.destinyText.text.toString().toDoubleOrNull() ?: 0.0
        ).toString()
    }

    fun calculateWeight(){
        weightProduct.calculateProductWeightNotPack()
        weightProduct.calculateProductWeightHasPack()
    }

}