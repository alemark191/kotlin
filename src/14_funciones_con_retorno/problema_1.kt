package `14_funciones_con_retorno`
/*
Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos.
 */
fun reciclarvalores(v1:Int, v2:Int, v3:Int ): Int {
    val promedio = (v1 + v2 + v3) /3
    return promedio

}

fun main(){
    println("ingrese el valor 1:")
    val valor1= readln().toInt()
    println("ingrese el valor 2:")
    val valor2= readln().toInt()
    println("ingrese el valor 3:")
    val valor3= readln().toInt()
    println("el promedio de $valor1,$valor2,$valor3 es: ${reciclarvalores(valor1,valor2,valor3)}")
}

