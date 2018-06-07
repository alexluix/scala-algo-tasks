package lp.algotasks.interviewbit.math

/**
  * Verify Prime
  *
  * https://www.interviewbit.com/problems/verify-prime
  */
object VerifyPrime {

  def isPrime(A: Int): Int  = {
    if (A <= 1) return 0
    if (A == 2) return 1

    val primesIdx = Array.fill(A + 1)(true)
    val sqrtA = Math.sqrt(A).toInt

    for (i <- 2 to sqrtA) {
      if (primesIdx(i)) {
        for (j <- 2 to (A / i)) {
          val idx = i * j
          if (idx == A) return 0
          primesIdx(idx) = false
        }
      }
    }

    if (primesIdx(A)) 1 else 0
  }

}
