class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        for(i in 1 until arr.size) {
            var gcd = gcd(answer, arr[i])
            
            answer *= arr[i] / gcd
        }
        return answer
    }

    fun gcd(a : Int, b : Int) : Int {
        var A = a
        var B = b
        while (B > 0) {
            var tmp = B
            B = A%B
            A = tmp
        }
        return A
    }
}