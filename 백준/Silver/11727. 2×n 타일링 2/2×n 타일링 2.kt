fun main() {

    var n = readLine()!!.toInt()
    var dp = IntArray(1001)

    dp[1] = 1
    dp[2] = 3

    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007
    }
    println(dp[n])
}