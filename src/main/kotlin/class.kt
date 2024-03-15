package org.example

class Araba(private val marka: String, private val model: String){
    fun calistir(){
        println("$marka $model çalıştırıldı.")
    }
    fun durdur(){
        println("$marka $model durduruldu.")
    }
}

fun main() {
    val araba1 = Araba("Toyota", "Supra")
    araba1.calistir()
    araba1.durdur()

}