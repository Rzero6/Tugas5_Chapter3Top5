class Motor:Transportasi(){
    override var roda: Int
        get()=2
        set(value) {
            roda=value
        }

    private val warna: String="Hijau"

    override fun bergerak() {
        println("\nMotor berjalan di darat")
    }
    override fun jumlahroda() {
        println("Motor mempunyai $roda roda")
    }
    fun warna(){
        println("Motor berwarna $warna")
    }
    fun bahanbakar(tipe1: String){
        println("Motor berbahan bakar $tipe1")
    }
    fun bahanbakar(tipe1: String,tipe2:String){
        println("Motor berbahan bakar $tipe1 atau $tipe2")
    }
    fun bahanbakar(tipe1: String,tipe2:String,tipe3:String){
        println("Motor berbahan bakar $tipe1, $tipe2, atau $tipe3 ")
    }
}