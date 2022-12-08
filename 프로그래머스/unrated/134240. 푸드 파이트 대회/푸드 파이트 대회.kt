class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""

        var left = ""
        var right = ""

        for (i in 1 until food.size) {
            if (food[i] != 0 ) {
                for (j in 0 until food[i] / 2) {
                    left += i.toString()
                    right += i.toString()
                }
            }
        }

        answer = left + "0"

        for (i in right.length-1 downTo 0 ) {
            answer += right.substring(i, i+1)
        }

        return answer
    }
}