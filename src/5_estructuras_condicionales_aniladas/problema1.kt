package `5_estructuras_condicionales_aniladas`

/*
Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo(cero) o negativo.

 */
fun main(){
    print("ingrese valor entero")
    val valor = readln().toInt()

    val numero= if (valor > 0)"positivo"
    else if (valor < 0)"negativo" else "es nulo"

    print("su numero es $numero")
}