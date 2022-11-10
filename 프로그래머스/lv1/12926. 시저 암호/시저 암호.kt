class Solution {
    fun solution(s: String, n: Int): String {
        return s.toList().joinToString(separator = "") {
            when(it) {
                in 'A'..'Z' -> ('A'.code + (it.code - 'A'.code + n) % ('Z' - 'A' + 1)).toChar()
                in 'a'..'z' -> ('a'.code + (it.code - 'a'.code + n) % ('z' - 'a' + 1)).toChar()
                else -> it
            }.toString()
        }
    }
}