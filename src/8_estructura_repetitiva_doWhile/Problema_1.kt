package `8_estructura_repetitiva_doWhile`
/*
Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999
(no sumar dicho valor, indica que ha finalizado la carga).
Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
 */

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        println("Ingrese un valor entre 0 y 9999")
        val num = readln().toInt()
        if (num > cant1)
            cant1++
        else
            if (num == cant2)
                cant2++
    }while (num != 9999)
    val suma = cant1 + cant2
    println("El valor acumulable es: $suma")
}