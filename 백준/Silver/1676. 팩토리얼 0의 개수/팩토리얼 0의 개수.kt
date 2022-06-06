import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var c2 = 0
    var c5 = 0

    for (i in 1..n) {
        var target = i

        while (target % 2 == 0) {
            c2++
            target = target / 2
        }
        while (target % 5 == 0) {
            c5++
            target = target / 5
        }
    }
    println(Math.min(c2, c5))
}