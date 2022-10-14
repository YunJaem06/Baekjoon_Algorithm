class Solution {
    fun solution(num: Int): Int = coll(num.toLong(), 0)

    fun coll(n : Long, r : Int) : Int =
        when {
            r > 500 -> -1
            n == 1L -> r
            else -> coll(if (n%2 == 0L) n/2 else (n*3)+1, r+1)
        }
}