fun main() {
    // write your code here
    val yourVariable = readLine()!!

    println("${yourVariable.length} repetitions of the word $yourVariable: ${yourVariable.repeat(yourVariable.length)}")
}