package `8_estructura_repetitiva_doWhile`

fun main(){
    do {
        print("ingrese un valor comprendido entre 0 y 999:")
        val valor: Int = readln().toInt()
        if (valor < 10)
            println("el valor ingresado tiene un solo digito")
        else
            if (valor < 100)
                println("el valor ingresado tiene dos dijitos")
        else
            println("el valor ingresado tiene tres dijitos")
    } while (valor !=0)
}