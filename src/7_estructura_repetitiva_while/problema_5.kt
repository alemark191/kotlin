package `7_estructura_repetitiva_while`
/*
Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.

 */
fun main(){
    var x: Int = 8
    while (x <= 500) {
        println(x)
        x = x + 8
    }

}