class Solution {
    fun solution(citations: IntArray): Int {
        val answer = citations.sortedDescending()

        for (i in answer.indices) {
            if (answer[i] <= i) {
                return i
            }
        }
        return answer.size
    }
}