class Solution {
    fun solution(s: String): String {
        var answer = ""
        var array  = s.split(" ")
        var max = Integer.parseInt(array[0])
        var min = Integer.parseInt(array[0])

        for (i in 1 until array.size){
            var num = Integer.parseInt(array[i])

            if (num > max) max = num
            if (num < min) min = num
        }
        answer = "$min $max"
        return answer
    }
}