import java.util.Scanner
import java.util.Stack

fun main() {
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()

    var n = sc.nextInt()
    var stack = Stack<Int>()

    var s = IntArray(n)

    for (i in 0 until n){
        s[i] = sc.nextInt()
    }
    for (i in 0 until n){
        while (!stack.isEmpty() && s[stack.peek()] < s[i]){
            s[stack.pop()] = s[i]
        }
        stack.push(i)
    }
    while (!stack.isEmpty()){
        s[stack.pop()] = -1
    }
    for (i in 0 until n){
        sb.append(s[i]).append(' ')
    }
    println(sb)
}