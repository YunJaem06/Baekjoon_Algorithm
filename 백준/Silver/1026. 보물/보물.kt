import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    val A = IntArray(a)
    val B = IntArray(a)

    for (i in 0 until a) {
        A[i] = sc.nextInt()
    }
    for (i in 0 until a) {
        B[i] = sc.nextInt()
    }
    Arrays.sort(A)
    Arrays.sort(B)
    var sum = 0
    for(i in 0 until a) {
        sum += A[i] * B[a -1 -i]
    }
    println(sum)
}