class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(
            celsius + 273.15,      // Kelvin
            celsius * 1.80 + 32.00 // Fahrenheit
        )
    }
}