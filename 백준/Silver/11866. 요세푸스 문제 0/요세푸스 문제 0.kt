import java.util.LinkedList
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var N = sc.nextInt()
    var k = sc.nextInt()

    var q = LinkedList<Int>()

    for (i in 0 until N) {
        q.add(i+1)
    }
    print("<")
    while (q.size > 0) {
        for (i in 0 until k-1) {
            q.add(q.poll())
        }
        print(q.poll())
        if (q.size > 0) {
            print(", ")
        }
    }
    print(">")
}