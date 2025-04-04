package `5_estructuras_condicionales_aniladas`

/*
Un postulante a un empleo realiza un test de capacitación, se obtuvo la siguiente información:
1. Se pide confeccionar un programa que ingrese los dos datos por teclado
2. cantidad total de preguntas que se le realizaron
3. cantidad de preguntas que contestó correctamente.

4.Informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido,

y sabiendo que:

	Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.

 */
fun main () {
    print("Ingrese la cantidad total de preguntas")
    val Preguntas = readln().toInt()
    print("Ingrese la cantidad de respuestas correctas")
    val Correctas = readln().toInt()
    val porcentaje = (Correctas.toDouble() / Preguntas) * 100
    val nivel = if (porcentaje >= 90) "nivel maximo"
    else if (porcentaje >= 75) "nivel medio"
    else if ( porcentaje >= 50)"nivel regular"
    else "fuera de nivel"
    print(" su porcentaje es de $nivel")



}

