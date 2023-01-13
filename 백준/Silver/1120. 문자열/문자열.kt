import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ")
    var ans = a.length

    for (i in 0..(b.length - a.length)) {
        var cnt = 0

        for (j in a.indices) {
            if (a[j] != b[j+i]) cnt++
        }
        if (ans > cnt) {
            ans = cnt
        }
    }
    println(ans)
}