package `4_estructura_condicional_como_expresion`

/*

Problema 2: Clasificar edad
Enunciado:
Solicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".

 */

fun main() {
    println("ingrese su edad")
    val edad = readln().toInt()
    val resultado = if (edad < 13) {
        print("usted es menor de edad")
    } else {
        if (edad >= 13 && edad <= 17) {
            print("usted es adolecente")
        } else
            println("Eres un adulto")
    }
}