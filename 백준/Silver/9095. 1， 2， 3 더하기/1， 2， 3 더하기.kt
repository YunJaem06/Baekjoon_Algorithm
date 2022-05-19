import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var arr = IntArray(11)
    arr[1] = 1
    arr[2] = 2
    arr[3] = 4

    for (i in 4..10){
        arr[i] = arr[i-3] + arr[i-2] + arr[i - 1]
    }
    for (j in 0 until n){
        var t = sc.nextInt()
        println(arr[t])
    }
}