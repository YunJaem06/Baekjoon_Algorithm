import java.util.*

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        val queue = LinkedList<Int>()
        var answer = 0
        section.toCollection(queue)
        var point = Int.MIN_VALUE

        while (queue.isNotEmpty()) {
            val node = queue.poll()
            if (point + m - 1 < node) {
                point = node
                answer++
            }
        }
        return answer
    }
}