class Solution {
    fun solution(n: Int): Int {
        var answer = IntArray(n + 1) { 1 }

        if (n > 2) {
            (3..n).forEach { answer[it] = (answer[it-1] + answer[it-2]) % 1234567 }
        }
        return answer[n]
    }
}