class Kapal:Transportasi() {
    override var roda: Int
        get() = 0
        set(value) {roda=value}

    private val warna : String = "Hitam"

    override fun bergerak() {
        println("\nKapal bergerak di atas air")
    }
    override fun jumlahroda() {
        println("Kapal tidak mempunyai roda")
    }
    fun warna(){
        println("Kapal berwarna $warna")
    }
    fun bahanbakar(tipe1: String){
        println("Kapal berbahan bakar $tipe1")
    }
    fun bahanbakar(tipe1: String,tipe2:String){
        println("Kapal berbahan bakar $tipe1 atau $tipe2")
    }
    fun bahanbakar(tipe1: String,tipe2:String,tipe3:String){
        println("Kapal berbahan bakar $tipe1, $tipe2, atau $tipe3 ")
    }
}