package org.example

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val firstElement = numbers.first()
    println("İlkElement: $firstElement")

    val firstElement1 = numbers.first{ it % 2 == 0}
    println("İlk Çift Sayı: $firstElement1")

}