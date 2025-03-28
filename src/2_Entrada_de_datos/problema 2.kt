package `2_Entrada_de_datos`


/* Realizar un programa que lea por teclado cuatro valores numéricos enteros e informe su suma y promedio.
 */
fun main(){

    println("ingrese el primer valor")
    val valor1: Int= readln().toInt()
    println("ingrese el segundo valor")
    val valor2: Int= readln().toInt()
    println("ingrese el tercer valor")
    val valor3: Int= readln().toInt()
    println("ingrese el cuarto valor")
    val valor4: Int= readln().toInt()
    val suma: Int = valor1+ valor2+ valor3+ valor4
    val promedio: Int = suma/4
    println("e valor del promedio es $promedio")

}