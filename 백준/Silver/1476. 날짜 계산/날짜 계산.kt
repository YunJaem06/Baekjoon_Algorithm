import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (e, s, m) = br.readLine().split(" ").map { it.toInt() }

    var ecopy = 1
    var scopy = 1
    var mcopy = 1
    var cnt = 1

    while (true) {
        if (e == ecopy && s == scopy && m == mcopy) break
        ecopy++
        scopy++
        mcopy++
        cnt++
        if (ecopy > 15) ecopy = 1
        if (scopy > 28) scopy = 1
        if (mcopy > 19) mcopy = 1
    }

    println(cnt)
}