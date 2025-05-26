package `16_funciones_parametro_por_defecto`

fun funciondenumeros (n : Int = 2,subinicial: Int=0, num1: Int= 0):Int{
    var total= subinicial + num1
    for (i in 1..n){
        println("digite un valor")
        val num = readln().toInt()
        total += num
    }
  return total
}
fun main(){
    println("dijite entre 2 y 5 digitos")
    println("cuantos dijitos deses ingresar")
    val num = readln().toInt()
    val total= funciondenumeros(num)
    println("la suma total de todos los digitos es suma")
}














