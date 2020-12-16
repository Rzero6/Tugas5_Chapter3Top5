open abstract class Transportasi {
    abstract var roda: Int
    open fun bergerak() {
        println("\nTranport bergerak")
    }
    open fun jumlahroda() {
        println("Jumlah roda Transportasi")
    }


}