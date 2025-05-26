package `14_funciones_con_retorno`
/*
En la función main del programa cargar los lados de dos
rectángulos y luego mostrar cual de los dos tiene una superficie mayor.
 */
fun ladosrectangulo(v1: Double, v2: Double,v3:Double,v4:Double) : Double {
    val t1= v1 * v2
    val t2= v3 * v4
    if (t1> t2) {
        print("El triangulo con mayor superficie es el primero con: $t1")
        return t1
    }else {
        print("El triangulo con mayor superficie es el segundo con: $t2")
        return t2
    }
}

fun main(){
    println("ingrese los lados del primer rectangulo:")
    println("ingrese el primer lado:")
    val lado1= readln().toDouble()
    println("ingrese el segundo lado:")
    val lado2= readln().toDouble()
    println("ingrese los lados del segundo rectangulo:")
    println("ingrese el primer lado:")
    val lado3= readln().toDouble()
    println("ingrese el segundo lado:")
    val lado4= readln().toDouble()
    ladosrectangulo(lado1,lado2,lado3,lado4)
}

