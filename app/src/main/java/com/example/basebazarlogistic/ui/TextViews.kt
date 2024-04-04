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


}