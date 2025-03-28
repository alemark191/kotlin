package `2_Entrada_de_datos`

/* Escribir un programa en el cual se ingresan cuatro números enteros, calcular e informar la suma de los dos primeros
y el producto del tercero y el cuarto.
 */

fun main(){
    println("ingrese primer numero ")
    val valor1: Int= readln().toInt()
    println("ingrese segundo numero ")
    val valor2: Int= readln().toInt()
    println("ingrese tercer numero ")
    val valor3: Int= readln().toInt()
    println("ingrese cuarto numero ")
    val valor4: Int= readln().toInt()
    val suma = valor1 + valor2
    println("el valor de la suma de $valor1 + $valor2 es $suma")
    val producto = valor3 * valor4
    println("el producto de $valor2 * $valor3 es $producto")







}