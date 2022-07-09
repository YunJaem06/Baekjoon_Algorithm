import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var num = IntArray(7)

    for (i in 0 until n){
        var sum = 0
        var min = 101
        for (j in 0 until 7){
            num[j] = sc.nextInt()

            if ((num[j] % 2) == 0){
                sum += num[j]
                if (num[j] < min){
                    min = num[j]
                }
            }
        }
        println("$sum $min")
    }
}