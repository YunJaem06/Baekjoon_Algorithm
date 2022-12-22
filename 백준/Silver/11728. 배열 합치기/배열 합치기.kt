import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var num = br.readLine().split(" ")
    var a = Integer.parseInt(num[0])
    var b = Integer.parseInt(num[1])

    var arrayA = br.readLine().split(" ")
    var arrayB = br.readLine().split(" ")
    var result = IntArray(a + b)

    var idx = 0
    for (i in 0 until a) {
        result[idx++] = Integer.parseInt(arrayA[i])
    }

    for (i in 0 until b){
        result[idx++] = Integer.parseInt(arrayB[i])
    }
    result.sort()

    for(i in result){
        bw.write("$i ")
    }
    bw.flush()
    bw.close()

}
