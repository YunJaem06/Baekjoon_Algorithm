import java.util.Arrays
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var T = sc.nextInt()

    for (i in 0 until T){
        var a = sc.nextInt()
        var b = sc.nextInt()

        var result = 1
        for (j in 0 until b){
            result = (result * a) % 10
        }
        if (result == 0){
            println(10)
        } else {
            println(result)
        }
    }
}
