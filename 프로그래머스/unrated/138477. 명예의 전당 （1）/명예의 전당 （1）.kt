class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val result = mutableListOf<Int>()

        for (i in score) {
            result += i
            answer += if (result.size > k) {
                result.sortedDescending().subList(0, k).minOf { it }
            } else {
                result.minOf { it }
            }
        }
        return answer.toIntArray()
    }
}