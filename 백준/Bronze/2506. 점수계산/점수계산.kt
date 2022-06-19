import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var arr = IntArray(n)

    for (i in 0 until n){
        arr[i] = sc.nextInt()
    }
    var count = 0
    var sum = 0
    for (i in 0 until n){
        if (arr[i] == 1){
            count++
            sum += count
        } else {
            count = 0
        }
    }
    println(sum)
}