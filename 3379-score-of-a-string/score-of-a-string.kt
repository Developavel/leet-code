class Solution {
    fun scoreOfString(s: String): Int {
        var score = 0
        for (i in 1 until s.length) {
            score += Math.abs(s[i - 1].toInt() - s[i].toInt())
        }
        return score
    }
}