import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        if (num > balance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $num.")
            balance -= num
            break
        }
        balance -= num
    }
    if (balance >= 0) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}