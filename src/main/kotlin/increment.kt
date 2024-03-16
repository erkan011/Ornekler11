package org.example

import java.math.BigInteger

data class Person(val name: String, var age: BigInteger){
    fun incrementAge(years: BigInteger){
        age += years
    }
}

fun main() {
    val person =Person("Erkan", BigInteger.valueOf(21))
    println("İlk Yaşı: ${person.age}")
    person.incrementAge(BigInteger("1000000000000000000000"))
    println("Son Yaşı: ${person.age}")
}