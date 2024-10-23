package com.example.tema3_pm_ejerciiccios

fun main() {
    ej1(3)
}

/* Escribe una función llamada esPar que tome un número como argumento y
devuelva true si es par y false si es impar. */
fun ej1(num: Int){

    var linea = "El número $num "

    if (!esPar(num)) linea += "no "

    linea += "es par."
    println(linea)
}

fun esPar(num: Int): Boolean{
'a'
    var esPar = false

    if (num % 2 == 0){
        esPar = true
    }

    return esPar
}

/* Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos
   y determine si son iguales utilizando tanto equals() como el operador ==. */
fun ej2(linea1: String, linea2: String){
    println(comparaTexto("asd", "asd"))
}

fun comparaTexto (texto1: String, texto2:String) : Boolean{
    return texto1.equals(texto2) /*o tambien texto1 == texto2*/
}

/*Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como argumentos
y devuelva true si ambos números son mayores que 10 y menores que 20, y false en caso contrario.*/

fun ej3(){
    println(esMayorQue10YMenorQue20(10, 3))
}

fun esMayorQue10YMenorQue20(num1:Int, num2:Int) : Boolean{

    return num1 >= 10 && num1 <= 20 && num2 >= 10 && num2 <= 20
}

/*Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un número entre 0 y 100)
 como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando una estructura whem.*/

fun evaluarCalificacion(cal:Int): Char{

    var resultado = ' '
    when (cal){
        in 0..50 -> resultado = 'F'
        in 51..60 -> resultado = 'E'
        in 61..70 -> resultado = 'D'
        in 71..80 -> resultado = 'C'
        in 81..90 -> resultado = 'B'
        in 91..100 -> resultado = 'A'
    }
    return resultado
}

/* 5. Define una función llamada sumarNumeros que tome un número variable de argumentos utilizando vararg y devuelva la suma de todos los números.*/
fun sumarNumeros( vararg varargs: Int) : Int{
    var resultado = 0
    for (it in varargs){
        resultado += it
    }

    return resultado
}

/*6. Implementa una función llamada invertirArray que tome un array de números como argumento y devuelva un nuevo array con los elementos en orden inverso.*/
fun invertirArray(lista: IntArray) : IntArray{
    return lista.reversedArray()
}

/*7. Crea una lista inmutable de nombres de frutas y agrega una fruta adicional a la lista.*/
fun frutasLoQueSeaEsto() : MutableList<String>{
    val lista = mutableListOf("Naranja", "Mango", "Pera")
    lista.add("Fresa")

    return lista
}

/*8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.*/
fun coloresCosas() : MutableList<String>{
    var lista = mutableListOf("Rojo", "Purpura", "Turquesa")
    lista.add("Marron")

    return lista
}

/* 9. Escribe una función llamada imprimirNumeros que utilice un bucle for para imprimir los números del 1 al 10.*/
fun imprimirNumeros(){
    for (i in 0 .. 10){
        print(i)
    }
}

/* 10. Define una función llamada imprimirLista que tome una lista de números como argumento y utilice un bucle forEach para imprimir cada número en la lista.*/
fun imprimirLista(lista: IntArray){
    lista.forEach { print(it) }
}

/* 11. Implementa una función llamada imprimirNumerosHastaN que tome un número como argumento y utilice un bucle while para imprimir los números del 1 al número dado.*/
fun imprimirNumerosHastaN(num : Int){

    var i = 0
    while (i < num){

        print(i)

        i++
    }
}

/* 12. Crea una función llamada imprimirNumerosPositivos que utilice un bucle do-while para imprimir números positivos hasta que se alcance un número negativo.*/
fun imprimirNumerosPositivos(){
    var num = 10
    do {
        print(num--)
    }while(num < 0)
}

/*13. Define una función llamada esPrimo que tome un número como argumento y devuelva true si es primo y false si no lo es. Utiliza una declaración return para salir de la función una vez que se determine si el número es primo.*/
fun esPrimo(num: Int) : Boolean{

    for (it in 2 .. num / 2){
        if (num % it == 0){
            return false
        }
    }

    return true
}

/*14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for para encontrar el primer número primo mayor que 100.
Utiliza una declaración break para salir del bucle una vez que se encuentre el número primo.*/
fun encontrarPrimoMayorQue100 () : Int{
    var resultado = 100

    for (it in 100 .. 1023){
        if (esPrimo(resultado)){
            resultado = it
            break
        }
    }

    return resultado
}