package `13_funciones_parametros`

fun mostrarmensaje (mensaje: String) {
    println("****************************************")
    println(mensaje)
    println("****************************************")
}
fun cargarsuma () {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores es:$suma")
}

fun main(){
    mostrarmensaje("el programa calcula la suma de " + " dos valores ingresados por teclado.")
    cargarsuma()
    mostrarmensaje("gracias por utilizar este " + "programa")
}