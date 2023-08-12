fun main(){
    val names = arrayOf("Luthfi", "Adilal", "Mahbub")
    for (name in names){
        println(name)
    }

    for (value in 0..20 step 5 ) {
        println(value)
    }

    val ukuranNames = names.size -1
    for (i in 0..ukuranNames){
        println("index $i = ${names.get(i)}")
    }
}