import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var dp = IntArray(n+1)
    var p = IntArray(n+1)
    for (i in 1 until n+1){
        p[i] = sc.nextInt()
    }
    for (i in 1 until n+1){
        for (j in 1..i){
            dp[i] = Math.max(dp[i],p[j]+dp[i-j])
        }
    }
    println(dp[n])
}