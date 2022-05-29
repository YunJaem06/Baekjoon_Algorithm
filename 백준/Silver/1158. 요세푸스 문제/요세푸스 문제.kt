import java.util.LinkedList
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var list = LinkedList<Int>()

    var N = sc.nextInt()
    var K = sc.nextInt()

    for (i in 1..N){
        list.add(i)
    }

    print("<")
    while (!list.isEmpty()){
        for (i in 0 until K){
            if (i == K-1) {
                var a = list.remove()
                if (list.size == 0){
                    print(a)
                } else print("$a, ")
            } else {
                list.add(list.remove())
            }
        }
    }
    print(">")
}