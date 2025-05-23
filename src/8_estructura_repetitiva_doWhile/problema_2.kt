package `8_estructura_repetitiva_doWhile`
/*
En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta
 corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar
 un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.
b) La suma total de los saldos acreedores.
 */
fun main(){
    var suma = 0.0
    var cuenta = 0
    do {
        print("ingrese sun numero de cuenta(negativo para terminar)")
       if (cuenta >= 0){
           val saldo = readln().toDouble()
           val estado = if (saldo > 0) {
               "acreedor"
           }else if (saldo <0){
               "deudor"
           }else {
               "nulo"
           }
           println("cuenta:$cuenta |saldo: $saldo |estado: $estado")
           if (saldo > 0){
               suma+=saldo
           }
       }
    }while (cuenta >= 0)
    println("suma total de saldo acreedores:$suma")
}
