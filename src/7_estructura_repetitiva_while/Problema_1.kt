package `7_estructura_repetitiva_while`

/*
Escribir un programa que solicite ingresar 10 notas de alumnos
 y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
fun main(){
    var mayor=0
    var menor=0
    var x=0
    while (x <= 9) {
        println( "ingresar una notas")
        var nota= readln().toInt()
        if (nota >= 7){
            mayor = mayor + 1
        }else
            menor = menor + 1
        x = x + 1
        nota = 0
    }
   println("las notas mayores son $mayor")
    println("las notas menores son $menor")
}