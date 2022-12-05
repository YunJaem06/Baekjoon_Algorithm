import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Scanner
import java.util.StringTokenizer
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 0 until t) {
        val xy = StringTokenizer(br.readLine())
        var x = xy.nextToken().toInt()
        var y = xy.nextToken().toInt()

        val distance = y - x

        var max = sqrt(distance.toDouble())

        var round = round(max)

        when {
            distance <= 3 -> bw.write("$distance\n")
            max > round -> bw.write("${round.toInt() * 2}\n")
            max <= round -> bw.write("${round.toInt() * 2 -1}\n")

        }
        bw.flush()
    }
    bw.close()
}