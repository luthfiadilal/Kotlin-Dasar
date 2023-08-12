fun main(){
    val finalExam = "A"
//    when (finalExam) {
//        "A" -> {
//            println("Lulus")
//        }
//        "B" -> {
//            println("Teu nanaon")
//        }
//        "C" -> {
//            println("Biasa saja")
//        }
//        else -> {
//            println("teu lulus")
//        }
//    }
    val nilai = "A"
    val passValues = arrayOf("A", "B", "C")
//    when (nilai) {
//        "A" , "B", "C" -> {
//            println("Lulus bagus")
//        }
//    }

    when (nilai) {
        in passValues -> {
            println("Lulus")
        }
        !in passValues -> {
            println("Tidak lulus")
        }
    }

    val name = "Luthfi"
    when (name) {
        is String -> {
            println("ya tipenya string")
        }
        !is String -> {
            println("bukan string")
        }
    }

    val angka = 90
    when {
        angka > 80 -> {
            println("Amazing")
        }
        angka > 70 -> {
            println("good")
        }
        else -> println("bad")
    }
}