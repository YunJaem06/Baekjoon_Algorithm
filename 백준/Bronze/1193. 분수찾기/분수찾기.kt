import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var x = sc.nextInt()

    var n = 0
    var top = 1
    var bot = 1
    var cnt = 0
    if (x == 1) {
        println("1/1")
    } else {
        while (cnt < x) {
            n++
            cnt=n*(n+1)/2
        }
        var num = x-(n-1)*n/2
        if (n%2==0) {
            top = num
            bot = n-num+1
        } else {
            top = n - num + 1
            bot = num
        }
        println("${top}/${bot}")
    }
}