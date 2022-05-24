import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    while (true){
        var n = sc.nextInt()
        if (n == 0){
            break
        }
        var arr = BooleanArray(2*n+1)
        arr[0] = true
        arr[1] = true

        var a = sqrt((2*n+1).toDouble())

        for (i in 2..a.toInt()){
            for (j in i*i until 2*n+1 step i) {
                arr[j] = true
            }
        }
        var cnt = 0
        for (i in n+1 until 2*n+1){
            if (arr[i] == false){
                cnt++
            }
        }
        println(cnt)
    }
}