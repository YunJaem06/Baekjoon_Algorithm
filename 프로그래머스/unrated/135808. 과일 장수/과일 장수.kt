class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var fscore = score.sorted().reversed()
        var index = 0
        while (true) {
            if (index+m > fscore.size) {
                break
            }
            answer += fscore[index + m -1] * m
            index += m
        }
        return answer
    }
}