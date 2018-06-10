package lp.algotasks.interviewbit.string

/**
  * Palindrome String
  *
  * [https://www.interviewbit.com/problems/palindrome-string]
  */
object PalindromeString {

  def isPalindrome(A: String): Int  = {
    val chars = A.filter(c => c.isLetter || c.isDigit).map(_.toLower).toCharArray

    val length = chars.length
    for (i <- 0 until length / 2) {
      if (chars(i) != chars(length - i - 1)) return 0
    }

    1
  }

}
