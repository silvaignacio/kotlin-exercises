package numbers

/**
 * Get prime number
 *
 * @param num
 * @return if is primer number
 */
fun getPrimeNumber(num: Int): Boolean {
    var isPrime = true
    for (i in 2..num / 2) {
        if(num % i == 0) {
            isPrime = true
            break
        }
    }
    return isPrime
}

fun main() {
    println(getPrimeNumber(10))
}