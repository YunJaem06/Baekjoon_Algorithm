import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var num = sc.nextInt()

    var count = 0
    for (i in 1..num) {
        if(i <= 99)
            count++
        else {
            var a = i / 100
            var b = (i % 100) / 10
            var c = (i % 100) % 10
            if(a - b == b - c)
                count++
        }
    }
    println(count)
}