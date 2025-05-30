package `19__arreglos`

fun main(){
    val arreglo = IntArray(10)
    for (i in arreglo.indices){
        println("ingrese elemntos:")
        arreglo[1] = readln().toInt()
    }
    for (elemento in arreglo)
        println(elemento)
    // ***************************************************
    for ((indice,elemto)in arreglo.withIndex())
        print(
            "en el indice $indice se almacena el" +
                    "elemento $elemto")
    //*****************************************************
    val sueldo = arrayOf<Double>(1200.0, 1700.50, 6000.0)
    for (i in sueldo.indices)
        println("${sueldo[i]} - ")
    //*****************************************************
    // funcion arrayoofNu11=
    val altura = arrayOfNulls<Float>(3)
    altura[0]=1.72f
    altura[1]=1.79f
    altura[2]=1.67f
for (indice in 0.. altura.size-1)
    println("$altura[indice] - ")

}