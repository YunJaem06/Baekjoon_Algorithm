import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        var n = sc.nextInt()
        if(n == 0) {
            break
        } else {
            var cnt = 0
            var str : String = Integer.toString(n)
            for (i in 0 until str.length/2) {
                if (str[i] == str[str.length - 1 - i]) {
                    cnt++
                }
            }
            if (cnt == str.length/2) {
                println("yes")
            } else {
                println("no")
            }
        }
    }
}