import java.util.*
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var d = sc.nextInt()
    var e = sc.nextInt()

    if (a < 0)
        println(abs(a) * c + d + b * e)
    else
        println((b-a)*e)
}