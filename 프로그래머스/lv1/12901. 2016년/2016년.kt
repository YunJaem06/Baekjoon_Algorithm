import java.text.SimpleDateFormat
import java.util.*

class Solution {
    fun solution(a: Int, b: Int): String {
        val cal = Calendar.getInstance()
        cal.set(2016, a-1, b)
        return SimpleDateFormat("EEE", Locale.ENGLISH).format(cal.timeInMillis).toUpperCase()
    }
}