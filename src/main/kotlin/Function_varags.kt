fun main(){
    var hasil = hitungTotal(null, 10,3,5,2,7,8,4)
    println(hasil)

    println(varag(null,2,5,8,12,54,32,7,19,23,41,3,8))
}

fun hitungTotal(name: String?,vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun varag(angka: Int?,vararg nilai: Int): Any {
    var result = 0.0

    for (i in nilai){
        result = (result + i) * 2
    }

    println(result)



    if (result > 100){
        println("Hasil lebih dari 100")
        return result

    } else {
        println("Hasil kurang dari 100")
        return result

    }


}