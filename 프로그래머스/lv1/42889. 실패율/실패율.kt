class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N)

        val humanMap : MutableMap<Int, Int> = mutableMapOf()
        val failMap : MutableMap<Int, Double> = mutableMapOf()

        stages.forEach {
            when(humanMap.containsKey(it)) {
                true -> humanMap[it] = humanMap.getValue(it) + 1
                false -> humanMap[it] = 1

            }
        }

        var totalSize = stages.size

        for (i in 1..N){
            when(humanMap.containsKey(i)){
                true -> {
                    failMap[i] = (humanMap.getValue(i) / totalSize.toDouble())
                    totalSize -= humanMap.getValue(i)
                }
                false -> failMap[i] = 0.0
            }
        }

        val list = failMap.toList().sortedByDescending { (_, value) -> value }

        for (i in 0 until N){
            answer[i] = list[i].first
        }

        return answer
    }
}