class Mobil:Transportasi() {
    override var roda: Int
        get()=4
        set(value) {
            roda=value
        }

    private val warna: String="Biru"

    override fun bergerak() {
        println("\nMobil berjalan di darat")
    }
    override fun jumlahroda() {
        println("Mobil mempunyai $roda")
    }

    fun warna(){
        println("Mobil berwarna $warna")
    }

    fun bahanbakar(tipe1: String){
        println("Mobil berbahan bakar $tipe1")
    }
    fun bahanbakar(tipe1: String,tipe2:String){
        println("Mobil berbahan bakar $tipe1 atau $tipe2")
    }
    fun bahanbakar(tipe1: String,tipe2:String,tipe3:String){
        println("Mobil berbahan bakar $tipe1, $tipe2, atau $tipe3 ")
    }

}

