class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var list = mutableListOf<Int>()
        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i])
            } else continue
        }
        if (list.size == 0) {
            list.add(-1)
        }
        list.sort()
        answer = list.toIntArray()
        return answer
    }
}