import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var N = sc.nextInt()
    var cnt = 1
    var count = 0
    var lenght = 10
    for (i in 1..N) {
        if(i == lenght) {
            cnt++
            lenght = lenght * 10
        }
        count = count + cnt
    }
    println(count)
}