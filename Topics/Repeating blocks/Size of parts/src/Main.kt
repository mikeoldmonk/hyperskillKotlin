fun main() {
    // put your code here

    val n = readln().toInt()

    var small = 0
    var large = 0
    var perfect = 0

    repeat(n) {
            val x = readLine()!!.toInt()
            if (x == 0) perfect++
            else if (x == 1) large++
            else if (x == -1) small++

    }

    println("$perfect $large $small")
}