package `10_estructura_condicional_when`

fun main(){
    println("ingrese coordenada x del punto:")
    val x = readln().toInt()
    println("ingrese coordenada y del punto:")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println("primer cuadrate")
        x < 0 && y > 0 -> println("segundo cuadrate")
        x < 0 && y < 0 -> println("tercer cuadrate")
        x > 0 && y < 0 -> println("cuatro cuadrate")
        else -> println("em punto se necuentra en un eje")
    }

}