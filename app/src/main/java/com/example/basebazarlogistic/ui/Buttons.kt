package com.example.basebazarlogistic.ui

import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.example.basebazarlogistic.R

class Buttons(private val activity: Activity) {

    var lengthButton: EditText = activity.findViewById(R.id.length)
    var widthButton: EditText = activity.findViewById(R.id.width)
    var heightButton: EditText = activity.findViewById(R.id.heigth)
    var oneBoxWeightButton: EditText = activity.findViewById(R.id.weigth_one_box)
    var courseYuanButton: EditText = activity.findViewById(R.id.yuan_course)
    var priceYuanProductButton: EditText = activity.findViewById(R.id.yuan_product_price)
    var courseDollarButton: EditText = activity.findViewById(R.id.dollar_course)
    var numberBoxesProductButton: EditText = activity.findViewById(R.id.number_boxes)
    var numberPlacePackButton: EditText = activity.findViewById(R.id.number_place_pack)
    var pressButton: Button = activity.findViewById(R.id.calculate_button)
    val pack: Spinner = activity.findViewById(R.id.pack)
    val category: Spinner = activity.findViewById(R.id.category)
    val delivery_speed: Spinner = activity.findViewById(R.id.delivery_speed)

    fun dropDownPack(){
        // Массив строк для отображения в списке
        val options = arrayOf("Скотч", "Бумажная обрешетка", "Деревянная обрешетка", "Палет")
        // Создаем адаптер
        val adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_item, options)
        // Устанавливаем ресурс макета для выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Устанавливаем адаптер для выпадающего списка
        pack.adapter = adapter
    }
    fun dropDownCategory(){
        // Получаем ссылку на Spinner по его id

        // Массив строк для отображения в списке
        val options = arrayOf("Хозтовары", "Одежда", "Электроника", "Poizon")
        // Создаем адаптер
        val adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_item, options)
        // Устанавливаем ресурс макета для выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Устанавливаем адаптер для выпадающего списка
        category.adapter = adapter
    }
    fun dropDeliverySpeed(){
        // Получаем ссылку на Spinner по его id
        // Массив строк для отображения в списке
        val options = arrayOf("Быстрая 12-15 дней", "Долгая 18-23 дня")
        // Создаем адаптер
        val adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_item, options)
        // Устанавливаем ресурс макета для выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Устанавливаем адаптер для выпадающего списка
        delivery_speed.adapter = adapter
    }
}
