import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var answer = sqrt(n.toDouble()).toLong()
        return if (answer * answer == n) (answer+1)*(answer+1) else -1
    }
}