import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while (scanner.hasNext()) {
        val next = scanner.next().toInt()
        list.add(next)
    }
    val max = list.maxOrNull()
    print("$max ${list.indexOf(max) + 1}")
}