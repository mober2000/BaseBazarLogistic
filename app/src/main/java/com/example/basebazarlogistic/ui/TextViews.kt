package com.example.basebazarlogistic.ui

import android.app.Activity
import android.widget.TextView
import com.example.basebazarlogistic.R

class TextViews(activity: Activity) {

    var volumeText: TextView = activity.findViewById(R.id.volume_value)
    var destinyText: TextView = activity.findViewById(R.id.destiny_value)
    var rubbleCoastProductText = activity.findViewById<TextView>(R.id.coast_rubles_product_value)
    var dollarCoastProductText = activity.findViewById<TextView>(R.id.coast_dollars_product_value)
    var weightOnePackText = activity.findViewById<TextView>(R.id.weight_one_pack_value)
    var weightAllPackText = activity.findViewById<TextView>(R.id.weight_all_pack_value)
    var coastOnePackText = activity.findViewById<TextView>(R.id.coast_one_pack_rubbles_value)
    var coastPackRubbleText = activity.findViewById<TextView>(R.id.coast_pack_rubble_value)
    var unloadSumCoastText = activity.findViewById<TextView>(R.id.unload_sum_coast_value)
    var weightProductNotPackText = activity.findViewById<TextView>(R.id.weight_product_not_pack_value)
    var weightProductHasPackText = activity.findViewById<TextView>(R.id.weight_product_has_pack_value)
    var tariffKgDollarText = activity.findViewById<TextView>(R.id.tariff_kg_dollar_value)
    var sumTariffDeliveryDolarText = activity.findViewById<TextView>(R.id.sum_tariff_delivery_dollar_value)
    var sumTariffDeliveryRubleText = activity.findViewById<TextView>(R.id.sum_tariff_delivery_rubble_value)
    var coastOneKgProductDollarText = activity.findViewById<TextView>(R.id.coast_one_kg_product_dollar_value)
    var percentInsuranceCoastProductText = activity.findViewById<TextView>(R.id.percent_insurance_coast_product_value)
    var insuranceDollarText = activity.findViewById<TextView>(R.id.insurence_dollar_value)
    var insuranceRubbleText = activity.findViewById<TextView>(R.id.insurance_rubble_value)
    var sumDeliveryText = activity.findViewById<TextView>(R.id.sum_delivery)
    var frunzenskayaDeliveryText = activity.findViewById<TextView>(R.id.frunzenskaya_delivery_value)
    var TotalCoastText = activity.findViewById<TextView>(R.id.total_coast_value)
}