fun main(){
    println("Provide the first number: ")
    val number1: Int = readln().toInt()

    println("Provide the second number: ")
    val number2 = readln().toInt()

    val sum: Int = number1 + number2
    val product: Int = number1 * number2
    val division: Int = number1 / number2
    val remainder: Int = number1 % number2

    println("Sum: $sum\nProduct: $product\nDivision: $division\nRemainder: $remainder")
}