fun main(){
    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80

//    val apakahLulus = passFinalExam && passAttendant
//    hasilnya false

    val apakahLulus = passFinalExam || passAttendant
//    hasinya true
    println(apakahLulus)
}