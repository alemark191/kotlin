package `2_Entrada_de_datos`

/* se debe desarrollar que pida el ingreso del

 */
fun main(){
    print("ingrese el precio del producto:")
    val precio: Double = readln().toDouble()
    print("ingrese lacantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    print("el total a pagar es $total")


}