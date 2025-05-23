package `9_estructura_repetitiva_for`

fun main() {
    var primero = 0
    var segundo = 0
    var tercero = 0
    var cuarto = 0

    print("Ingrese la cantidad de puntos: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print("Ingrese coordenada X del punto $i: ")
        val x = readLine()!!.toInt()

        print("Ingrese coordenada Y del punto $i: ")
        val y = readLine()!!.toInt()

        if (x > 0) {
            if (y > 0) {
                primero = primero + 1
            } else {
                cuarto = cuarto + 1
            }
        } else {
            if (y > 0) {
                segundo = segundo + 1
            } else {
                tercero = tercero + 1
            }
        }
    }

    println("Puntos en el primer cuadrante: $primero")
    println("Puntos en el segundo cuadrante: $segundo")
    println("Puntos en el tercer cuadrante: $tercero")
    println("Puntos en el cuarto cuadrante: $cuarto")
}