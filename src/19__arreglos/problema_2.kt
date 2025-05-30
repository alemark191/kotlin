package `19__arreglos`
/*
Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
 Obtener la suma de los dos arreglos elemento a elemento,
 dicho resultado guardarlo en un tercer arreglo del mismo tamaño.

 */

fun main() {
    val tamaño = 4
    val arreglo1 = IntArray(tamaño)
    val arreglo2 = IntArray(tamaño)
    val suma = IntArray(tamaño)
    println("Ingresa los elementos del primer arreglo:")
    for (i in 0 until tamaño) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readln().toInt()
    }
    println("Ingresa los elementos del segundo arreglo:")
    for (i in 0 until tamaño) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readln().toInt()
    }
    for (i in 0 until tamaño) {
        suma[i] = arreglo1[i] + arreglo2[i]
    }
    println("\nEl arreglo con la suma de los elementos es:")
    for (i in 0 until tamaño) {
        println("Suma[$i] = ${suma[i]}")
    }
}
