class Solution {
    fun solution(answers: IntArray): IntArray {
        var cnt = IntArray(3)
        var a = intArrayOf(1,2,3,4,5)
        var b = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var c = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        for (i in answers.indices) {
            if (answers[i] == a[i % a.size]) cnt[0]++
            if (answers[i] == b[i % b.size]) cnt[1]++
            if (answers[i] == c[i % c.size]) cnt[2]++
        }

        var max = cnt[0].coerceAtLeast(cnt[1].coerceAtLeast(cnt[2]))
        var list : MutableList<Int> = ArrayList()
        if (max == cnt[0]) {
            list.add(1)
        }
        if (max == cnt[1]){
            list.add(2)
        }
        if (max == cnt[2]) {
            list.add(3)
        }
        val answer = IntArray(list.size)
        for (i in list.indices) {
            answer[i] = list[i]
        }

        return answer
    }
}