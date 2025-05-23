package `13_funciones_parametros`
/*
Desarrolla un programa en Kotlin que le pide al usuario ingresar una clave dos veces. El programa debe
 si ambas entradas son iguales y mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:
Una función llamada verificarClaves que recibe dos textos (las claves) y verifica si son iguales.


Una función principal main que pide al usuario que ingrese dos veces una clave y luego llama a verificarClaves para comprobar si ambas coinciden.

 */
fun verificarclave(){
    println(" ingrese la primera clave")
    val v1= readln().toInt()
    println(" ingrese la clave para confirmar")
    val v2= readln().toInt()
    if (v1 == v2)
        println("la clave es igual")
    else
        println("la clave es diferente")
}

fun main(){
    verificarclave()
}
