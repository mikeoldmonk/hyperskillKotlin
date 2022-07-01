package cinema

fun main() {
    val seats = readln().toInt()
    val rows = readln().toInt()

    var sum = seats * rows

    if (sum <= 60) {
        println(sum * 10)
    } else {
        println((rows.floorDiv(2) * 10 * seats) + ((rows - rows.floorDiv(2)) * 8 * seats))
    }
}