package search

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


fun main() {
    println(linearSearch(listOf<String>("Hello", "World", "Hope", "are", "well"), "Hello"))
}