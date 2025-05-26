package `15_funciones_con_exprecion_unica`



fun retornarsuperficie (lado : Int ): Int= lado * lado
fun main(){
    println("ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    println("la superficie del cuadrado es ${retornarsuperficie(lado)}")
}