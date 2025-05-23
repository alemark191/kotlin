package `6_condiciones_compuestas_operadores_logicos`
/*
Se ingresan tres valores por teclado, si todos
son iguales calcular el cubo del número y mostrarlo.
 */


fun main() {
    print("ingrese numero:")
    val num1 : Int = readln().toInt()
    print("ingrese numero: ")
    val num2 : Int = readln().toInt()
    print("ingrese numero: ")
    val num3 : Int = readln().toInt()
    val cubo: Int = num1 * num1 * num1
    if (num1 == num2 && num2 == num3)
            print("el valor del cubo de $num1 es $cubo")
        else
        print("los numeros no son iguales")
}