package `6_condiciones_compuestas_operadores_logicos`

/*
Se ingresan por teclado tres números, si al menos uno de los valores
 ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".

 */fun main(){
    print("ingrese numero:")
    val num1 : Int = readln().toInt()
    print("ingrese numero:")
    val num2 : Int = readln().toInt()
    print("ingrese numero:")
    val num3 : Int = readln().toInt()
    if (num1 < 10 || num2 < 10 || num3 < 10 )
        print("algun numero es menor a 10")
    else
        print("no tiene ningun numero menor a 10")
}