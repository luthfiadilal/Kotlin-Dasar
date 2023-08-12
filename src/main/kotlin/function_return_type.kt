fun main(){
    println(sum(4,9))
    val result = sum(2,7)
    println(result)
    println(bagi(10, 4))
    println(bagi(10, 0))
}

fun sum(a:Int, b: Int):Int {
    val total = a + b
    return  total
}

fun bagi(a: Int, b:Int): Int{
    if (b == 0){
        return  0
    } else {
        val hasil = a / b
        return hasil
    }

}