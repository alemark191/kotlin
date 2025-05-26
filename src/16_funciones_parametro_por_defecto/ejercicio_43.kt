package `16_funciones_parametro_por_defecto`

fun titulosybrayado(titulo:String,caracter:String= "*"){
 println(titulo)
 for (i in 1 ..titulo.length)
     println(caracter)
    println()
}
fun main(){
    titulosybrayado("sistema de administracon")
    titulosybrayado("ventas","*-*" )
}