package `13_funciones_parametros`

fun mostrarperimetro (lado: Int){
    val perimetro = lado * 4
    println("El perimetro es $perimetro")
}
fun mostrarsuperficie(lado : Int){
    val superficie = lado * lado
    println("la superficie es $superficie")
}
fun main(){
println("ingrese el valor del lado de un cuadrado")
val lado = readln().toInt()
print("quiero calcular el perimetro o la" + "superfie[ingresar texto:perimetro/superficie]")
var respuesta = readln()
    when (respuesta){
    }
}



