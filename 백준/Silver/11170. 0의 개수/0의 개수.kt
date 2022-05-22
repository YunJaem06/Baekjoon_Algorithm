import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    for (i in 0 until a){
        var n = sc.nextInt()
        var m = sc.nextInt()

        var cnt = 0

        for (j in n..m){
            var t = j
            if (t == 0){
                cnt++
                continue
            }
            while (t > 1){
                if (t % 10 == 0){
                    cnt++
                }
                t /= 10
            }
        }
        println(cnt)
    }
}