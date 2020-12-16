

fun main (){
    val mobil = Mobil()
    mobil.bergerak()
    mobil.jumlahroda()
    mobil.warna()
    mobil.bahanbakar("Bensin","Diesel","Listrik")

    val motor = Motor()
    motor.bergerak()
    motor.jumlahroda()
    motor.warna()
    motor.bahanbakar("Bensin","Listrik")

    val kapal = Kapal()
    kapal.bergerak()
    kapal.jumlahroda()
    kapal.warna()
    kapal.bahanbakar("Diesel")

    val pesawat=pesawat()
    pesawat.bergerak()
    pesawat.jumlahroda()
    pesawat.warna()
    pesawat.bahanbakar("Avgas")


}


