package com.example.tema3_pm_ejerciiccios

fun main(){
    ej1(3)
    // 2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y determine si son iguales utilizando tanto equals() como el operador ==.
    // 3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como argumentos y devuelva true si ambos números son mayores que 10 y menores que 20, y false en caso contrario.
    // 4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un número entre 0 y 100) como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando una estructura whem.
}

fun ej1(num: Int){
    // Escribe una función llamada esPar que tome un número como argumento y
    // devuelva true si es par y false si es impar.

    var linea = "El número $num "

    if (!esPar(num)) linea += "no "

    linea += "es par."
    println(linea)
}

fun esPar(num: Int): Boolean{


    var esPar = false

    if (num % 2 == 0){
        esPar = true
    }

    return esPar
}