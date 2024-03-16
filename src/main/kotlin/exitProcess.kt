package org.example

import kotlin.system.exitProcess

fun main() {
    val x = 5
    val y = 0
    val result = divide(x, y)
    if (result == null) {
        println("Bir hata oluştu program sonlandırılıyor")
        exitProcess(1)
    }
    println("Sonuç: $sonuc")
}
fun divide(a: Int,b:Int): Int?{
    return if (b != 0) {
        a/b
    }else{
        null
    }
}