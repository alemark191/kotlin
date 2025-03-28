package `2_Entrada_de_datos`

fun main(){
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segun valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor1
    println("la suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("el producto de $valor1 y $valor2 es $producto")
}
