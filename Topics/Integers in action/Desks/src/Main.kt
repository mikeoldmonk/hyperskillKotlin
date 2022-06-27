fun main() {
    // put your code here
    val class1 = readln().toInt()
    val class2 = readln().toInt()
    val class3 = readln().toInt()
    val tableClass1 = class1 / 2 + class1 % 2
    val tableClass2 = class2 / 2 + class2 % 2
    val tableClass3 = class3 / 2 + class3 % 2

    val sumTables = tableClass1 + tableClass2 + tableClass3

            println(sumTables)
}