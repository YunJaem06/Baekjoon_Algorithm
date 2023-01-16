import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var input = sc.nextLine()

    if (input.equals("1 2 3 4 5 6 7 8"))
        println("ascending")
    else if (input.equals("8 7 6 5 4 3 2 1"))
        println("descending")
    else
        println("mixed")
}