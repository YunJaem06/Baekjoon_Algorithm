class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer : MutableList<Int> = mutableListOf()

        for (i in 0 until numbers.size -1) {
            for (j in i+1 until numbers.size) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        return answer.toSet().sorted().toIntArray()
    }
}