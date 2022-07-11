fun main() {
    val (num1, num2, num3, num4, num5) = Array("5".toInt()) { readln().toInt() }
    print(num5 in num1..num2 && num5 in num3..num4)
}