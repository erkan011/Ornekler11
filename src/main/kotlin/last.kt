package org.example

fun main() {
    val element = listOf(1,2,3,4,5,6,7,8,9)

    val listElement = element.last()
    println("Son Element: $listElement")

    val listElement1 = element.last { it % 2 == 0}
    println("Son Çift Element: $listElement1")
}