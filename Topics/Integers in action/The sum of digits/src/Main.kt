import java.lang.Integer.sum

fun main() {
    // put your code here
    val number = readln().toInt()
    val a = number / 100
    val b = (number % 100) /10
    val c = number % 10
    val sum = a + b + c
    println(sum)

}