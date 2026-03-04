fun main() {
    val temperature = readln().toInt()
    val hot: Boolean = readln().toBoolean()
    val cold = temperature < 28

    if (hot) {
        println("The AC is on")
    } else if (cold) {
        println("The AC is off")
    } else {
        println("The AC is idle")
    }
}