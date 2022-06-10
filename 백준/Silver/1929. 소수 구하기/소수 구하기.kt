import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var m = sc.nextInt()
    var check = BooleanArray(m+1)
    check[0] = true
    check[1] = true

    for (i in 2..m){
        if (check[i] == false){
            if (i >= n)
                println(i)
            for (j in i+i..m step i)
                check[j] = true
        }
    }
}