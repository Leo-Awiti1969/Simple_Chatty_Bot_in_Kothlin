fun main() {
    var count = 0
    val (num1, num2, num3) = Array("3".toInt()) { readln().toInt() }
    for (i in num1..num2) {
        if (i % num3 == 0) {
            count++
        }
    }
    println(count)
}