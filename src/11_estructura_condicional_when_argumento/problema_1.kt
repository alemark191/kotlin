package `11_estructura_condicional_when_argumento`
/*
Problema 1
Realizar la carga de la cantidad de hijos de 10 familias.
Contar cuántos tienen 0,1,2 o más hijos. Imprimir dichos contadores.
 */
fun main(){
    var h0 = 0
    var h1 = 0
    var h2 = 0
    var h3 = 0
    for (i in 1..10) {
        println("ingrese la cantidadde hijos que tienen:")
        val hijos = readln().toInt()
        when (hijos) {
            0 -> h0++
            1 -> h1++
            2 -> h2++
            else -> h3++
        }
    }
    println("las famulias que tiene 0 hijos son $h0")
    println("las famulias que tiene 1 hijos son $h1")
    println("las famulias que tiene 2 hijos son $h2")
    println("las famulias que tiene mas de 2 hijos son $h3")
}
