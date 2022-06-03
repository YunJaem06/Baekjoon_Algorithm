import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var N = sc.nextInt()
    var count = 1
    var num = 666

    while (count != N){
        num++
        var s = Integer.toString(num)
        if (s.contains("666")){
            count++
        }
    }
    println(num)
}
