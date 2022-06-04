import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var dp = IntArray(n+1)

    dp[1] = 0

    for (i in 2..n){
        dp[i] = dp[i-1] + 1
        if (i % 2 == 0){
            dp[i] = Math.min(dp[i], dp[i/2]+1)
        }
        if (i % 3 == 0){
            dp[i] = Math.min(dp[i], dp[i/3] + 1)
        }
    }
    print(dp[n])
}