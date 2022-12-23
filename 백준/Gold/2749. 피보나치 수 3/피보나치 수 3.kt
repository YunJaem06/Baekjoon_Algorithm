import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var pisano = 1500000
    var n = br.readLine().toLong() % pisano
    var num = LongArray(pisano+1)

    num[0] = 0
    num[1] = 1

    for (i in 2..1500000) {
        num[i] = (num[i - 1] + num[i - 2]) % 1000000
    }

    println(num[n.toInt()])
}