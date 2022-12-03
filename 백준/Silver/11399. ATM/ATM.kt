

fun main() {

    var p = 0
    var num = readLine()!!.toInt()
    var str = readLine()!!.split(" ")
    var list = ArrayList<Int>()
    var time = 0
    for (i in 0 until num) {
        list.add(str[i].toInt())
    }

    list.sort()

    for (i in list.indices) {
        p += time+list[i]
        time += list[i]
    }

    println(p)

}