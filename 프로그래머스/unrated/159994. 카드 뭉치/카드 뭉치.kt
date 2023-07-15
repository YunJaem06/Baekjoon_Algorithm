class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer = "Yes"

        var a = 0
        var b = 0

        var i = 0
        while (i < goal.size) {
            if (a < cards1.size && goal[i] == cards1[a]){
                a++
            } else if (b < cards2.size && goal[i] == cards2[b]) {
                b++
            } else {
                answer = "No"
                break
            }
            i++
        }

        return answer
    }
}

fun main (){
    println(
        Solution().solution(arrayOf("i","drink","water"), arrayOf("want","to"), arrayOf("i", "want", "to", "drink", "water"))
    )
}

