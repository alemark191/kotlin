package `3_estructura_condicional_if`


/*
Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado"
 */
fun main(){
    print("ingrese las tres notas")
   print("nota uno")
    val nota1: Int = readln().toInt()
    print("nota dos")
    val nota2: Int = readln().toInt()
    print("nota tres")
    val nota3: Int = readln().toInt()
    val suma = nota1+nota2+nota3
    val promedio= suma/3

    if (promedio >= 7) {
       println("su nota es $promedio usdted a sido promocionado")
    } else
        println("su nota es $promedio usdted no  a sido promocionado")





}