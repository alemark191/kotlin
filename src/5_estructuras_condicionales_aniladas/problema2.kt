package `5_estructuras_condicionales_aniladas`

/*
Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando
 si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

 */
fun main(){
    print("ingrese un numero")
    val numero = readln().toInt()

    val resultado= if (numero <= 9) "1"
    else if (numero <= 99 )"2" else "3"
    if (numero > 999)
        print("error")
    else

    print(" su numero tiene $resultado cifras ")
}