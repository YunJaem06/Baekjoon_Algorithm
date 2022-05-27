import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()
    var b = sc.next()

    var result = a.length

    for (i in 0 until  b.length-a.length + 1) {
        var tmp = 0

        for (j in 0 until a.length) {
            if (a[j] != b[j+i]) {
                tmp++
            }
        }
        if (result > tmp) {
            result = tmp
        }
    }
    println(result)
}