package cinema

fun main() {
    val seats = readln().toInt()
    val rows = readln().toInt()

    if (seats > 9 || rows > 9) {
        println("error")
    } else {

        var sum = seats * rows

        if (sum <= 60) {
            println(sum * 10)
        } else {
            var firstRows = rows.floorDiv(2)
            var secondRows = rows - firstRows
            var sumFirst = firstRows * seats * 10
            var sumSecond = secondRows * seats * 8
            println(sumFirst + sumSecond)
        }
    }
}