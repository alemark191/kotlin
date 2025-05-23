package `9_estructura_repetitiva_for`

/* Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de
la base y la altura de un triángulo. El programa deberá informar:

a) De cada triángulo la medida de su base, su altura y su
 superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).

b) La cantidad de triángulos cuya superficie es mayor a 12.

 */
fun main() {
    var cantidad= 0
    var superficie= 0
    print("cuantos triangulos quiere ingresar:")
    val numerodato = readln().toInt()
    for (i in 1..numerodato) {
        println("escriba la base del triangulo:")
        var base = readln().toInt()
        println("ingresa la altura del triangulo:")
        var altura = readln().toInt()
        println("las bases es : $base")
        println("las alturas es : $altura")
        val superfucie = base * altura / 2
        println ("La superficie es: $superfucie")
        if (superfucie >= 12) {
            cantidad++
        }

    }
        println("Los triangulos con superficie mayor a 12 son: $cantidad")
}

