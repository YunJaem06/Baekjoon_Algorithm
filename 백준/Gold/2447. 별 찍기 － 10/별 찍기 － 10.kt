import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var n = nextInt()
    val result = StringBuilder()

    for (i in 0 until n) {
        for (j in 0 until n) {
            result.append(star(i, j, n / 3))
        }
        result.appendLine()
    }
    print(result)
}
fun star(row: Int, col: Int, size: Int): Char {
    if ((row / size) % 3 == 1 && (col / size) % 3 == 1) {
        return ' '
    }
    return if (size == 1) '*'
    else star(row, col, size/3)
}