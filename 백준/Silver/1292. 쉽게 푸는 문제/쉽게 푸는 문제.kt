import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    var arr : IntArray = IntArray(1002)

    var count = 1

    for(i in 1..1000) {
        for (j in 0 until i) {
            if (count == 1001) break
            arr[count] = i
            count++
        }
    }
    var sum = 0
    for (i in a..b) {
        sum += arr[i]
    }
    println(sum)
}