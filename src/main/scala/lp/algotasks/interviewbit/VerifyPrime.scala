package lp.algotasks.interviewbit

/**
  * Verify Prime
  *
  * https://www.interviewbit.com/problems/verify-prime
  */
object VerifyPrime {

  def isPrime(A: Int): Int  = {
    if (A <= 1) return 0
    if (A == 2) return 1

    for (i <- 2 to Math.sqrt(A).ceil.toInt) {
      if (A % i == 0) return 0
    }

    1
  }

}
