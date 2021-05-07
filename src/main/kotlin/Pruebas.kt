import java.math.BigInteger


/**
 * Slit string
 *
 * @param cadena
 */
fun slitString(cadena: String) = cadena.split(" ").reversed().joinToString()


/**
 * Linear search
 *
 * @param T
 * @param list
 * @param key
 * @return
 */
fun <T:Comparable<T>> linearSearch (list: List<T>, key: T):Int? {
    for ((index, value) in list.withIndex()) {
        if(value == key) return index
    }
    return null
}


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
    val lista = mutableListOf(1 ,5, 6,1)
    println(lista.binarySearch(6))
    println(21293.toString(2))

    val factorialNumber = getMultiplyNumbers(6)
    println(factorialNumber)
    println(slitString("Hola caballeros como estan"))
    println(getPrimeNumber(10))

    val listaQla = listOf<String>( "Hola", "Mundo")
    val posicion = linearSearch(listaQla, "Mundo")
    println(posicion)
}
