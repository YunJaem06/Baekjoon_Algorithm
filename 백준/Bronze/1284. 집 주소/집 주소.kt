import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while (true){
        var count = 0
        var s = sc.next()

        if (s.equals("0")) System.exit(0)
        for (i in 0 until s.length){
            var a = s.substring(i,i+1)

            if (a.equals("1")) count+=3
            else if (a.equals("0")) count+=5
            else count+=4
        }
        println(count+1)
    }
}