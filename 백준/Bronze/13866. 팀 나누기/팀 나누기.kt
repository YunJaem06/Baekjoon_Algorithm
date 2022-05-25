import java.util.*
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var d = sc.nextInt()

    println(abs((a+d) - (b+c)))
}