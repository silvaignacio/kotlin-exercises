package strings

fun splitString(cadena: String) = cadena.split(" ").reversed().joinToString()

fun main() {
    println(splitString("Hello world, hope you are well"))
}