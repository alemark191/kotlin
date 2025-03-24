package `1_tipos_de_variables`

fun main() {
    /*
   Crear un programa que defina dos variables inmutables de tipo Int. Luego definir una
 tercer variable mutable que almacene la suma de las dos primeras variables y las
 muestre. Seguidamente almacenar en la variable el producto de las dos primeras
 variables y mostrar el resultado.
    */

    val Variable1: Int
    Variable1 = 5
    val Variable2: Int
    Variable2 = 10
    var suma: Int

    suma = Variable1 + Variable2
println(suma)

    var producto: Int
    producto= Variable1 * Variable2
    println(producto)




}