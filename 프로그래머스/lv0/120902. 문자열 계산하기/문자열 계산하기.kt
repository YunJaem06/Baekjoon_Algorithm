class Solution {
    fun solution(my_string: String): Int {
        var stingArr = my_string.split(" ")
        var answer = Integer.parseInt(stingArr[0])

        for (i in 1 until stingArr.size step 2) {
            if (stingArr[i] == "+") {
                answer += Integer.parseInt(stingArr[i+1])
            } else {
                answer -= Integer.parseInt(stingArr[i+1])
            }
        }
        return answer
    }
}