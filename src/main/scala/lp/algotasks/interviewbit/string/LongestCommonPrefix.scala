package lp.algotasks.interviewbit.string

/**
  * Longest Common Prefix
  *
  * [https://www.interviewbit.com/problems/longest-common-prefix]
  */
object LongestCommonPrefix {

  def longestCommonPrefix(A: Array[String]): String  = {
    val max = A.map(_.length).max
    val stringBuilder = StringBuilder.newBuilder

    for (i <- 0 until max) {
      var exists = true
      var prevLetter: Character = null
      for (string <- A) {
        if (string.length <= i) {
          exists = false
        } else {
          if (prevLetter == null) {
            prevLetter = string(i)
          } else if (prevLetter != string(i)) {
            exists = false
          }
        }
      }

      if (exists) stringBuilder.append(prevLetter)
    }

    stringBuilder.toString()
  }

}
