package `10_estructura_condicional_when`

/*
Se ingresa por teclado un valor entero,
mostrar una leyenda por pantalla que indique si el número es positivo, nulo o negativo.
 */
fun main(){
    println("ingrese un valor entero:")
    val num = readln().toInt()
    when{
        num > 0 -> println("es positivo")
        num < 0 -> println("es negativo")
        else -> println("es nulo")
    }

}
