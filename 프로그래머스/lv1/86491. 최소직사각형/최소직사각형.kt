class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var w = 0
        var h = 0
        for (s in sizes){
            w = maxOf(w, s[0], s[1])
            h = h.coerceAtLeast(if (s[0] < s[1]) s[0] else s[1])
        }
        return w*h
    }
}