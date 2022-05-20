import java.util.*
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var arr = IntArray(n)

    var count = 1
    var max = 1
    var count2 = 1

    for (i in 0 until n){
        arr[i] = sc.nextInt()
    }
    for (i in 0 until n-1){
        if (arr[i] <= arr[i+1]) count++
        else count = 1
        max = max(max, count)
    }
    for (i in 0 until n-1) {
        if (arr[i] >= arr[i + 1]) count2++
        else count2 = 1
        max = max(max, count2)
    }
    println(max)
}
