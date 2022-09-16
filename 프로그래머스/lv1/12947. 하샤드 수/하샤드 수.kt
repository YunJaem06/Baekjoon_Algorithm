class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var tmp = x

        while (tmp != 0) {
            sum += tmp % 10
            tmp /= 10
        }
        return (x % sum == 0)
    }
}