package `19__arreglos`
/*
Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
 */
fun main(){
    var arriba = 0
    var abajo = 0

    var elemento= IntArray(8)
  for  (i in 0..7) {
      println("ingrese un elemento")
      elemento[1] = readln().toInt()
  }

  for (i in 0..7) {
      if (elemento[1] >= 36) {
          arriba++
          println("el numero $elemento es mayor a 36")
      }
      if (elemento[1] >= 50) {
          abajo++
          println("el numero $elemento es mayor a 50")
      }else {
          println("es un numero bajo")
      }
  }
}

