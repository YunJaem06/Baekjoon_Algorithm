class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = IntArray(photo.size)
        for (i in photo.indices){
            for (j in photo[i].indices){
                for (k in name.indices){
                   if (photo[i][j] == name[k]) answer[i] += yearning[k]
                }
            }
        }
        return answer
    }
}