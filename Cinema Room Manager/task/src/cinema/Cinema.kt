package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    if (seats > 9 || rows > 9) {
        println("error")
    } else {

        var sum = seats * rows

        if (sum <= 60) {
            var sumSmall = sum * 10
            println("Total income:")
            println("$$sumSmall")
        } else {
            var firstRows = rows.floorDiv(2)
            var secondRows = rows - firstRows
            var sumFirst = firstRows * seats * 10
            var sumSecond = secondRows * seats * 8
            var sumBig = sumFirst + sumSecond
            println("Total income:")
            println("$$sumBig")
        }
    }
}