import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var cup = 1
    for (i in 0 until n){
        var x = sc.nextInt()
        var y = sc.nextInt()

        if (cup == x)
            cup = y
        else if (cup == y)
            cup = x
    }
    println(cup)

}