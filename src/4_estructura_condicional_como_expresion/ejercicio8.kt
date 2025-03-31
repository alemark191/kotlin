package `4_estructura_condicional_como_expresion`

fun main(){
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("estudia segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2)valor1 else valor2
    print("el mayor entre $valor1 y $valor2 es $mayor")

}