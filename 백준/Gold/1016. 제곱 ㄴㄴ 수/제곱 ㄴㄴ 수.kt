import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (min, max) = readLine().split(" ").map { it.toLong() }
    val num = BooleanArray((max - min + 1).toInt()) { true }

    for (i in 2..sqrt(max.toDouble()).toInt()) {
        val square = i * i.toLong()

        var answer = (min / square) * square

        if (answer < min) {
            answer += square
        }

        for (j in answer .. max step square) {
            num[((j - min).toInt())] = false
        }
    }
    val cnt = num.count { it }
    println(cnt)
}