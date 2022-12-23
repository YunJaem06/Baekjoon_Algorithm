import java.util.Scanner

fun main() = with(Scanner(System.`in`.bufferedReader())) {
    var n = nextInt()
    var a : Long = 0
    var b : Long = 1
    var c : Long= 0

    if (n == 1) {
        println(1)
    } else {
        for (i in 1 until n) {
            c = a + b
            a = b
            b = c
        }
        println(c)
    }
}