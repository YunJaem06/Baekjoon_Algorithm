class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        return (count * (price.toLong() + price * count) / 2L - money).coerceAtLeast(0)
    }
}