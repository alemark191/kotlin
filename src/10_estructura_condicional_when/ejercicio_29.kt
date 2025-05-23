package `10_estructura_condicional_when`

fun main() {
    var total = 0
    for (i in 1..10) {
        println("ingrese suedo del operario:")
        val sueldo = readln().toInt()
        total += when{
            sueldo > 500 -> {
                println("sueldo alto")
                sueldo
            }
            sueldo > 200 -> {
                println("sueldo madio")
                0
            }
           else -> {
               println("sueldo bajo")
               0
           }
        }
    }
}