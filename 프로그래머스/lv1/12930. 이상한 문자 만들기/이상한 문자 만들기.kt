class Solution {
    fun solution(s: String): String {
        var answer = ""
        var cnt = 0
        for (i in s.indices){
            if (s[i] == ' ') cnt = -1
            answer += if (cnt%2 == 0) s[i].uppercase() else s[i].lowercase()
            cnt++
        }
        return answer
    }
}