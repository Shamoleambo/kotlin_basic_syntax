fun main () {
    print("Provide the temperature level: ")
    val temperature: Int = readln().toInt()

    if(temperature >= 28){
        println("Hot day")
    } else if(temperature >= 20) {
        println("Warm day")
    } else if (temperature >= 12) {
        println("Cold day")
    } else {
        println("Very cold day")
    }
}