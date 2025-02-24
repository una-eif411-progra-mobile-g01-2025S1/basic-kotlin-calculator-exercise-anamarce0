class Calculator {
    fun add(x: Double, y: Double): Double = x + y
    fun subtract(x: Double, y: Double): Double = x - y
    fun divide(x: Double, y: Double): Double = if (y == 0.0)
        throw IllegalArgumentException("No se puede dividir por cero") else x / y
    fun multiply(x: Double, y: Double): Double = x * y
}
