abstract class Character(val name: String,val health: Int) {
   // abstract var health: Int      // Abstract Property
   // abstract var name: String
    abstract fun drawingPhase()
    abstract fun discardPhase()  // Abstract Methods
}
class characters(name: String,health: Int) : Character(name,health) {

    override fun drawingPhase() {
        println("$name turn:")
        println("$name turn:")
    }
    override fun discardPhase() {
        println()
    }
}
fun main(args: Array<String>) {
    val eng = characters("Kwan Yue",4)

}