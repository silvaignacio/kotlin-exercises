package numbers

/**
 * @author Ignacio Silva
 * @param num: Int
 * @return factorial: Long
 */
fun getMultiplyNumbers(num: Int): Long {
    if(num >= 1)
        return num * getMultiplyNumbers(num - 1)
    return 1
}

fun main() {
    println(getMultiplyNumbers(6))
}