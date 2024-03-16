package org.example

fun main() {
    println("lütfen Adınızı Giriniz: ")
    val ad= readlnOrNull()
    println("Merhaba, $ad! Kaç yaşındasınız")
    val yas = readlnOrNull()?.toIntOrNull()

    if (yas != null){
        println("Anladım, $yas yaşındasınız. Teşekkürler!!")
    }else{
        println("Geçerli Yaş Değeri Girilmedi!!")
    }
}