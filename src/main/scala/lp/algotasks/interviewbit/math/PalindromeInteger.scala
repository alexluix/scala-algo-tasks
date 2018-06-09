package lp.algotasks.interviewbit.math

/**
  * Palindrome Integer
  *
  * [https://www.interviewbit.com/problems/palindrome-integer]
  */
object PalindromeInteger {

  val base = 10

  def isPalindrome(A: Int): Int = {
    if (A < 0) return 0

    var reverse: Long = 0
    var temp = A

    while (temp > 0) {
      reverse = reverse * base + temp % base
      temp = temp / base
    }

    if (reverse == A) 1 else 0
  }

}
