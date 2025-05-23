package `6_condiciones_compuestas_operadores_logicos`
/*
Escribir un programa en el cual: dada una lista de tres valores enteros ingresados
por teclado se guarde en otras dos variables el menor y el mayor de esa lista. Utilizar
 el if como expresión para obtener el mayor y el menor.

 */
    fun main(){
        print("ingrese  tres numeros enteros:")
        val num1 : Int = readln().toInt()
        print("ingrese otro numero:")
        val num2 : Int = readln().toInt()
        print("ingrese otro numero:")
        val num3 : Int = readln().toInt()

        val mayor = if (num1 >= num2 && num1 >= num3) {
            num1
        } else if (num2 >= num1 && num2 >= num3) {
            num2
        } else {
            num3
        }

        val menor = if (num1 <= num2 && num1 <= num3) {
            num1
        } else if (num2 <= num1 && num2 <= num3) {
            num2
        } else {
            num3
        }
        println("El mayor es: $mayor")
        println("El menor es: $menor")
    }



