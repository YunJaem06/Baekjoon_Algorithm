import java.util.Arrays
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var count = sc.nextInt()
    var arr = IntArray(count)

    for (i in 0 until count){
        arr[i] = sc.nextInt()
    }
    Arrays.sort(arr)

    var max = arr[count-1]

    var min = arr[0]

    println(max*min)
}