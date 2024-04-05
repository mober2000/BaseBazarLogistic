import android.app.Activity
import android.util.Log
import com.example.basebazarlogistic.ui.Buttons
import com.example.basebazarlogistic.ui.TextViews

class Tariff(activity: Activity) {

    fun calculateTariffCoast(category: String, deliverySpeed: String, density: Double): Double {
        // Массив объектов, где каждый объект содержит диапазон плотности и стоимость
        val tariffs = arrayOf(
            Tariff(100, 109, 5.2),
            Tariff(110, 119, 5.1),
            Tariff(120, 129, 5.0),
            Tariff(130, 139, 4.9),
            Tariff(140, 149, 4.8),
            Tariff(150, 159, 4.7),
            Tariff(160, 169, 4.6),
            Tariff(170, 179, 4.5),
            Tariff(180, 189, 4.4),
            Tariff(190, 199, 4.3),
            Tariff(200, 249, 4.2),
            Tariff(250, 299, 4.1),
            Tariff(300, 349, 4.0),
            Tariff(350, 399, 3.9),
            Tariff(400, 599, 3.8),
            Tariff(600, 799, 3.7),
            Tariff(800, 999, 3.5),
            Tariff(1000, Int.MAX_VALUE, 3.4)
        )

        if (category == "Хозтовары" && deliverySpeed == "Быстрая 12-15 дней") {
            val densityInt = density.toInt()
            for (tariff in tariffs) {
                if (densityInt in tariff.minDensity..tariff.maxDensity) {
                    Log.d("TariffCoast", "Found tariff for density $densityInt: ${tariff.cost}")
                    return tariff.cost // Возвращаем стоимость, если плотность находится в диапазоне
                }
            }
            Log.d("TariffCoast", "No suitable tariff found for density $densityInt")
            return -1.0 // Если подходящий диапазон не найден
        } else {
            Log.d("TariffCoast", "No suitable tariff found for category $category or delivery speed $deliverySpeed")
            return -2.0 // Если условия не выполняются
        }
    }

    data class Tariff(val minDensity: Int, val maxDensity: Int, val cost: Double)
}
