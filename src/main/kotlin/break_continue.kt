fun main(){
//    var i = 0
//    while (true){
//        println("Berhenti -> perulangan $i")
//        i++
//        if (i > 100)
//            break
//    }


    for (value in 1..100){
        if (value % 2 == 0){
            continue
        }

        println(value)
    }
}