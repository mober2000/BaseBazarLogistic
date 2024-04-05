package com.example.basebazarlogistic.methods

import android.app.Activity
import com.example.basebazarlogistic.calculators.Packs
import com.example.basebazarlogistic.calculators.VolumeAndDestiny
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class PreOrderCalculateMethods(private val activity: Activity) {
    var packs = Packs(activity)
    var volumeAndDestiny = VolumeAndDestiny(activity)
    val buttons = Buttons(activity)
    val textViews = TextViews(activity)

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



}