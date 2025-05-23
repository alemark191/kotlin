package `12_concepto_de_funciones`
/*
Desarrollar un programa con dos funciones
. La primera solicite el ingreso de un entero y muestre el cuadrado de dicho valor
. La segunda que solicite la carga de dos valores y muestre el producto de los mismos
. Llamar desde la main a ambas funciones.
 */
fun cuadradoentero(){
println("ingrese un valor entero:")
    val val1 = readln().toInt()
    val cuadrado = val1 * 2
    println("el cuadrado de $val1 es $cuadrado")
    println("********************************+**************")
}

fun cargarvalores(){
println("ingrese dos valores")
    println("ingrese el primer valor")
    val p1 = readln().toInt()
    println("ingrese el segundo valor")
    val p2 = readln().toInt()
    val producto= p1 * p2
    println("el producto de los valores $p1 y $p2 es $producto")
    println("********************************+**************")
}

fun main(){
    cuadradoentero()
    cargarvalores()
}