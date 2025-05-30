package `19__arreglos`

fun main(){
val sueldos : IntArray//arreglo de lista tipo int(entero)
//se define 5 epacios del 0 al 4
sueldos= IntArray(5)


// carga de sus elementos porteclado
for (i in 0..4){
    print("ingrese sueldo:")
    sueldos [1] = readln().toInt()
}
//impresion de sus elemtos
for (i in 0..4)
    println(sueldos)
}

