import kotlin.math.sqrt
typealias P = Point


fun main() {
    val place1 = Point(11,-9)
    val place2 = Point(2,5)
    val Nums = place1 == place2
    println(Nums)

    val theOtherSide = place2.symetrycal()
    println("$theOtherSide is the symmetric points of place2")

    val length = place2.distancee(place1)
    println(length)




}

data class Point(val x: Int, val y: Int){
    override fun toString(): String {
        val forX = x.toString()
        val forY = y.toString()
        return "$forX $y"
    }

    fun equalNubers(other: Any?): Boolean {
        if(other is Point) {
            return (other.x == this.x) && (other.y == this.y)
        }
        return false
    }

    fun symetrycal(): Int {
        return (-x -y)
    }

    fun distancee(point: Point): Double {
        val d = sqrt(((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y)).toDouble())
        return d
    }
}
