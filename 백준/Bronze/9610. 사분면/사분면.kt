import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var arr = IntArray(5)

    for (i in 0 until n) {
        var x = sc.nextInt()
        var y = sc.nextInt()

        if (x > 0 && y > 0) {
            arr[0]++
        } else if (x < 0 && y > 0) {
            arr[1]++
        } else if (x < 0 && y < 0) {
            arr[2]++
        } else if (x > 0 && y < 0) {
            arr[3]++;
        } else {
            arr[4]++
        }
    }
    println("Q1: ${arr[0]}")
    println("Q2: ${arr[1]}")
    println("Q3: ${arr[2]}")
    println("Q4: ${arr[3]}")
    println("AXIS: ${arr[4]}")
}