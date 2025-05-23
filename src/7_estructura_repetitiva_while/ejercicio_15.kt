package `7_estructura_repetitiva_while`
/*
escribir un programa que solicite la carga de un valor positivo
 y nos muestre desde 1 hasta el valor ingrese de una en uno.
 Ejemplo: si ingresamos 30 se debe mostrar en pantalla los
 bumeros del 1 al 10
 */
fun main(){
    println("ingrese n valor:")
    val valor = readln().toInt()
    var x = 1
    while ( x <= valor){
        println(x)
        x = x + 1
    }






}