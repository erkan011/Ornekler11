package org.example

data class Kisi (val ad: String, var yas: Int, var ePosta: String)

val kisi = Kisi("Erkan", 21 , "erkancaliskan011@gmail.com")

val sonuc = kisi.run {
    println("Ad: $ad")
    println("Yaş: $yas")
    yas += 5 //yaşı arttırır
    println("E-Posta: $ePosta")
    ePosta = "ec7949870@gmail.com"
}

fun main() {
    println("Güncellenen Yaş: ${kisi.yas}")
    println("Güncellenen E-Posta: ${kisi.ePosta}")
}