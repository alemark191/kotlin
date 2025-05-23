package `11_estructura_condicional_when_argumento`

fun main(){
    println("ingrese un valor entero positivo comprendido entre" + "el 1 y el 99999")
    val valor = readln().toInt()
    when (valor){
        in 1..9 -> print("tiene 1 dijito")
        in 10..99 -> print("tiene 2 dijito")
        in 100..999 -> print("tiene 3 dijito")
        in 1000..9999 -> print("tiene 4 dijito")
        in 10000..99999 -> print("tiene 5 dijito")
        else -> println(" no se encuentra comprendido en el rango " + "indicado")
    }

}