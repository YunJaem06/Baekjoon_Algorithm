class Solution {
    fun solution(s: String): Int {
        var answer = 0
        var first = s[0]
        var cnt = 0
        var diff = 0
        for (i in s.indices) {
            if (cnt == diff) {
                answer++
                first = s[i]
            }
            if (first == s[i]) {
                cnt++
            } else {
                diff++
            }
        }
        return answer
    }
}