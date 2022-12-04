fun main() {

    var n = readLine()!!.toInt()
    var list: MutableSet<String> = mutableSetOf()

    repeat(n) {
        list.add(readLine().toString())
    }

    var result = list.sortedWith { a, b ->
        when {
            a.length > b.length -> 1
            a.length < b.length -> -1
            else -> a.compareTo(b)
        }
    }
    result.forEach{ println(it) }

}