class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer : ArrayList<Int> = arrayListOf()

        for (n in commands) {
            var a = n[0] - 1
            var b = n[1] - 1
            var c = n[2] - 1

            answer.add(array.sliceArray(IntRange(a,b)).sorted()[c])
        }
        return answer.toIntArray()
    }
}