import java.util.*
import kotlin.system.exitProcess

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var k = sc.nextInt()
    var check = BooleanArray(n+1)

    var cnt = 0
    for (i in 2..n){
        for (j in i..n step i){
            if (check[j] == false){
                cnt++
                check[j] = true
            }
            if (cnt == k) {
                println(j)
                exitProcess(0)
            }
        }
    }
}