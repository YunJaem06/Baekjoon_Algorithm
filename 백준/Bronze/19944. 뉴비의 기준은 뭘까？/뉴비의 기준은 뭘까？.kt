import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var m = sc.nextInt()
    if (m <= 2) println("NEWBIE!")
    else if (n < m) println("TLE!")
    else println("OLDBIE!")
}