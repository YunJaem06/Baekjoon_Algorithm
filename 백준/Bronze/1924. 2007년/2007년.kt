import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var month = sc.nextInt()
    var day = sc.nextInt()

    var sum = 0

    var months = arrayOf(0,31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    for (i in 1..12){
        if (i == month){
            break
        }
        sum += months[i]
    }
    sum += day

    var left = sum%7
    when(left){
        0 -> println("SUN")
        1 -> println("MON")
        2 -> println("TUE")
        3 -> println("WED")
        4 -> println("THU")
        5 -> println("FRI")
        6 -> println("SAT")
    }
}
