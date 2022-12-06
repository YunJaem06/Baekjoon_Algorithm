import java.io.BufferedReader
import java.io.InputStreamReader

private val br = BufferedReader(InputStreamReader(System.`in`))

fun main() {
    var sb = StringBuffer()
    var dots = List(br.readLine().toInt()) {br.readLine().split(" ").let { Pair(it[0].toInt(), it[1].toInt()) }}
        .sortedWith(compareBy({it.first}, {it.second}))

    for (dot in dots) {
        sb.append("${dot.first} ${dot.second}\n")
    }
    println(sb)
}