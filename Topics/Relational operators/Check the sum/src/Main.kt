fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val ab = a + b
    val ac = a + c
    val bc = b + c

    val check = ab == 20 || ac == 20 || bc == 20

    println(check)
}