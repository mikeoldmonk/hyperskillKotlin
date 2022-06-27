fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    val dif = num1 != num2 && num2 != num3 && num3 != num1

    println(dif)


}