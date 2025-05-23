package `6_condiciones_compuestas_operadores_logicos`

/*
Realizar un programa que pida cargar una fecha cualquiera,
luego verificar si dicha fecha corresponde a Navidad.
 */
fun main() {
    print("ingrese un un dia cualquiera")
    val dia : Int = readln().toInt()
    print("ingrese un mes cualquiera")
    val mes : Int = readln().toInt()
    if (dia == 24 && mes == 12)
        print("hoy es navidad")
    else
        print("hoy no es navidad")
}