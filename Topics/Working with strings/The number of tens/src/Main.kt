fun main() {
    val numberInput = readln().toInt()
    val tensInNumber = numberInput / "10".toInt()
    print(tensInNumber.toString().last())
}