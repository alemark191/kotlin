package `7_estructura_repetitiva_while`
/*Se ingresan un conjunto de n alturas de personas por teclado
(n se ingresa por teclado). Mostrar la altura promedio de las personas.
 */
fun main(){
    println("dijite el numero de alturas que va a ingresar")
    val n = readln().toInt()
    var x = 1
    var suma = 0.0
    while (x <= n){
        print("ingrese una altura:")
        val valor = readln().toDouble()
        suma = suma + valor
        x = x + 1
    }
    val promedio = suma / n
    print("el promedio de las alturas es: $promedio")


}
