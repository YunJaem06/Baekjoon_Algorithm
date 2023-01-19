class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var a = num1
        var b = num2
        var answer = 0
        if(num1 == num2) {
            answer = 1
        } else {
            answer = -1
        }
        return answer
    }
}