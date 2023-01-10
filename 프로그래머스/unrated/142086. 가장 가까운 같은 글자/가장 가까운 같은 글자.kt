class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(s.length)

        answer[0] = -1

        for (i in 1 until s.length) {
            var x = s.lastIndexOf(s.substring(i, i+1), i - 1 )

            if (x != -1) {
                answer[i] = i-x
            } else {
                answer[i] = x
            }
        }

        return answer
    }
}