import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val t = readLine().toInt()
    val regex = Regex("(100+1+|01)+")

    repeat(t) {
        println(if (regex.matches(readLine())) "YES" else "NO")
    }
}