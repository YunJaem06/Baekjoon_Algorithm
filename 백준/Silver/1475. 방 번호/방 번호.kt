import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var N = sc.next()

    var numarr = IntArray(10)
    for (i in N.toCharArray()) {
        var num = i -'0'
        if (num == 9) {
            num = 6
        }
        numarr[num]++
    }
    numarr[6] = numarr[6]/2 + numarr[6]%2
    Arrays.sort(numarr)
    println(numarr[9])
}