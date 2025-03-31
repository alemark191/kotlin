package `4_estructura_condicional_como_expresion`

/*
Problema propuesto
Problema 1: Determinar el número con mayor valor absoluto
Enunciado:
Solicita al usuario ingresar dos números enteros (pueden ser negativos). Luego, determina cuál
 de los dos tiene mayor valor absoluto y muestra ese número en pantalla.
 */
fun main(){
    print("ingrese un numero entero:")
    val valor1 = readln().toInt()
    print("ingrese otro numero entero:")
    val valor2 = readln().toInt()
    val resultado = if (valor1 > valor2){
        print("el numero con mayor valor es $valor1")
    }else{
        print("el numero con mayor valor es $valor2")
    }

}