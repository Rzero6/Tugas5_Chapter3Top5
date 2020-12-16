class pesawat:Transportasi() {
    override var roda: Int
        get()=3
        set(value) {
            roda=value
        }

    private val warna: String="Putih"

    override fun bergerak() {
        println("\nPesawat terbang di langit")
    }
    override fun jumlahroda() {
        println("Pesawat mempunyai $roda roda")
    }
    fun warna(){
        println("Pesawat berwarna $warna")
    }
    fun bahanbakar(tipe1: String){
        println("Pesawat berbahan bakar $tipe1")
    }
    fun bahanbakar(tipe1: String,tipe2:String){
        println("Pesawat berbahan bakar $tipe1 atau $tipe2")
    }
    fun bahanbakar(tipe1: String,tipe2:String,tipe3:String){
        println("Pesawat berbahan bakar $tipe1, $tipe2, atau $tipe3 ")
    }
}