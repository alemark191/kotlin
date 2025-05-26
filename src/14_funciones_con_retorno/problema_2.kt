package `14_funciones_con_retorno`
/*
onfeccionar una función que calcule la superficie de un rectángulo y la retorna
, la función recibe como parámetros los valores de dos de sus lados:
	fun retornarSuperficie(lado1: Int,lado2: Int): Int
 */
fun retornarSuperficie(lado1: Int,lado2: Int): Int{
    val superdifice = lado1 * lado2
    return superdifice
}

fun main(){
    println("ingrese el valor 1:")
    val lado1= readln().toInt()
    println("ingrese el valor 2:")
    val lado2= readln().toInt()
    println("el resultado es:${retornarSuperficie(lado1,lado2)}")
}
