class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var num = n

        while (num >= a) {
            answer += (num / a) * b

            num -= num / a * a - num / a * b
        }
        return answer
    }
}