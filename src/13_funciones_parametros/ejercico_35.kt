package `13_funciones_parametros`

fun mostrarMayor(v1: Int, v2 : Int, v3 : Int){
    print("mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
    else
        print(v3)
}
fun main(){
    println("ingrese primer valor:")
    val valor1 = readln().toInt()
    println("ingrese segundo valor:")
    val valor2 = readln().toInt()
    println("ingrese tercer valor:")
    val valor3 = readln().toInt()
    mostrarMayor(valor1,valor2,valor3)


}