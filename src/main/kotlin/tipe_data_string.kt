import kotlin.concurrent.fixedRateTimer

fun main(){
    var fristName: String = "luthfi"
    var lastName: String = "Adilal"
    var fullName: String = "$fristName $lastName"
    var addres: String = """
      jl sjniusghduybhjdbyughjsbhbgb
      knbjhcbyhebchjebchibeyc
      jnebchuvehjc ehjcvue
      khejbcugevsgeshcbue
    """.trimIndent()

    var desc: String = "$fullName length = ${fullName.length}"

    println(fristName)
    println(lastName)
    println(fullName)
    println(addres)
    println(desc)
}