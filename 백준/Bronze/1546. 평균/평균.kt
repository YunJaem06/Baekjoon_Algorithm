import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = IntArray(10)

    var a = sc.nextInt()
    var total = 0.0
    var max = 0
    for (i in 0 until a){
        var score = sc.nextInt()
        total += score
        if (score > max) {
            max = score
        }
    }
    var avg : Double = total / max * 100 / a
    println(avg)
}