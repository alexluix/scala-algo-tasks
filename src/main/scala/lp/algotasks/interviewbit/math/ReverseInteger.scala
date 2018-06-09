package lp.algotasks.interviewbit.math

/**
  * Reverse integer
  *
  * [https://www.interviewbit.com/problems/reverse-integer]
  */
object ReverseInteger {

  val base = 10

  def reverse(A: Int): Int  = {
    var reverse: Long = 0
    var number = Math.abs(A)

    while (number > 0) {
      reverse = reverse * base + number % base
      number = number / base
    }

    if (!reverse.isValidInt) return 0

    if (A > 0) reverse.toInt else -reverse.toInt
  }

}
