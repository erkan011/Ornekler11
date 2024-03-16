package org.example

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    if (numbers.isEmpty()) {
        println("liste Boş")
    }else{
        println("Liste Boş Değil")
    }

    val names = listOf<String>()

    if (names.isEmpty()){
        println("İsim Listesi Boş")
    }else {
        println("İsim Listesi Boş Değil")
    }
}

//fun main() {
//    val numbers = listOf<Int>()
//    if (numbers.isEmpty()) {
//        println("liste Boş")
//    }else{
//        println("Liste Boş Değil")
//    }
//
//    val names = listOf("Erkan", "Eymen", "Ayten", "cahit", "Burak")
//
//    if (names.isEmpty()){
//        println("İsim Listesi Boş")
//    }else {
//        println("İsim Listesi Boş Değil")
//    }
//}