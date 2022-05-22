import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()

    var str = sc.next()
    var sum = 0
    var len = str.length
    for (i in 0 until str.length){
        var a = Integer.toBinaryString(str[i]-'0')
        if (a.length == 2 && i!=0) a = "0" + a
        else if (a.length == 1 && i!=0) a = "00" + a

        sb.append(a)
    }
    println(sb)
}
