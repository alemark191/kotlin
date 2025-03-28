package `2_Entrada_de_datos`

fun main() {
 print("ingrese la medida del dato cuadrado:")
 val lado: Int = readln().toInt()
 val perimetro: Int = lado * 4
 println("el perimetro del cuadrado es $perimetro")


}