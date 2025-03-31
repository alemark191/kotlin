package `4_estructura_condicional_como_expresion`

/*
Problema 3: Determinar tipo de triángulo
Enunciado:
Solicita al usuario que ingrese tres valores enteros positivos que representan
los lados de un triángulo. Valida primero que puedan formar un triángulo (la suma
de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
 Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.

 */
fun main(){
    println("ingrese tres valores que representen los lados de un triangulo")
    println("ingrese val1 ")
    val  val1 = readln().toInt()
    println("ingrese val2")
    val  val2 = readln().toInt()
    println("ingrese val3")
    val  val3 = readln().toInt()
    val lados = val1 + val2
    if (lados>val3) {
        if (val1 == val2 && val2 == val3 && val1 == val3)
            print("es equilatero")
        else
            if (val1 == val2 || val2 == val3 || val1 == val3)
            print("es isoceles")
    }else
        print("El triangulo es Escaleno")
}