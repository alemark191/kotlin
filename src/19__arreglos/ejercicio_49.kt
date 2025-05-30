package `19__arreglos`

fun main(){
    val arreglo = IntArray(10)
    for (i in arreglo.indices){
    print("igrese elementos:")
    arreglo[1] - readln().toInt()
    }
    println("primer componente del arreglo ${arreglo[0]}")
    println("ultima componente del " + " arreglo  ${arreglo.lastIndex}")
}