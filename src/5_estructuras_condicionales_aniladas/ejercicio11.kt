package `5_estructuras_condicionales_aniladas`

fun main(){
    print("ingrese primera nota")
    val nota1 = readln().toInt()
    print("ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("ingrese tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3

    val estado= if (promedio >= 4)"promocionado"
    else if (promedio >= 4)"regular" else "reprobado"

    print("estado del alumno $estado")


}