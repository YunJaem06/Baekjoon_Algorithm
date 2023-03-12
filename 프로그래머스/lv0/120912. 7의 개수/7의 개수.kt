class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0

        array.forEach {
            it.toString().forEach {
                if (it == '7'){
                    answer++
                }
            }
        }
        return answer
    }
}