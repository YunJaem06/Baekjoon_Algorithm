class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right){
            var list = ArrayList<Int>()
            for (l in 1..i){
                if (i%l == 0){
                    list.add(l)
                }
            }
            if (list.size % 2 == 0) {
                answer += i
            } else {
                answer -= i
            }
        }
        return answer
    }
}