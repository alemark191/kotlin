package `7_estructura_repetitiva_while`

/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran
 entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá informar el
 importe que gasta la empresa en sueldos al personal.

 */
fun main() {
    println("ingrese la cantidade empleados:")
    val n = readln().toInt()
    var x = 1
    var pago1= 0
    var pago2= 0
    var resta= 0
    while (x <= n) {
        print("ingrese el sueldo:")
        val sueldo = readln().toInt()
        if (sueldo >= 100 && sueldo <= 300) {
            pago1 = pago1 + 1
            resta = resta + sueldo
        } else {
            pago2 = pago2 + 1
            resta = resta + sueldo
        }
        x = x + 1
    }

    println("los sueldos entre 100y 300 son $pago1")
    println("los sueldos mayores a 500 son $pago2")
    println("el gastro promedio es $resta")
}