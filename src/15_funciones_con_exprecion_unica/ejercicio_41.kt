package `15_funciones_con_exprecion_unica`

fun retornarmayor(v1: Int, v2:Int)= if (v1>v2) v1 else v2

fun main(){
    println("ingrese el primer valor")
    val valor1 = readln().toInt()
    println("ingrese el primer valor")
    val valor2 = readln().toInt()
    println("el mayor numero entre $valor1 y $valor2 es ${retornarmayor(valor1,valor2 )}")
}