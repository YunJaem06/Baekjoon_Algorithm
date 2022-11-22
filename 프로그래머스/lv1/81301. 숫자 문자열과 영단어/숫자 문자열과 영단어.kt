class Solution {
    fun solution(s: String): Int {
        var num = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var str = s
        for (i in num.indices) {
            str = str.replace(num[i], i.toString())
        }
        return str.toInt()
    }
}