fun main() {
    println("provide the temperature")
    val temperature = readln().toInt()
    var airConditionerIsOn: Boolean = false

    if (temperature > 25) {
        airConditionerIsOn = true
    } else if (temperature < 20) {
        airConditionerIsOn = false
    }

    println("Air conditioner is on: $airConditionerIsOn")
}