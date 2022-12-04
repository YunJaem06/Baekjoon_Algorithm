fun main() {

    var (n , k) = readln().split(" ").map { it.toInt() }
    var list = ArrayList<Int>()
    var result = 0

    for (i in 0 until n) {
        list.add(readln().toInt())
    }

    for (j in n-1 downTo 0){
        result += k / list[j]
        k %= list[j]
    }
    println(result)

}