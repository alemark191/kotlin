package `3_estructura_condicional_if`

fun main() {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        print("la suma de los dos valores es: $suma")
        print("la resta de los dos valores es $resta")
    } else{
        val producto = valor1 * valor2
        val division = valor1 / valor2
        print("el producto de los dos valores es: $producto")
        print("la division de los dos valoes es: $division")
    }
}
