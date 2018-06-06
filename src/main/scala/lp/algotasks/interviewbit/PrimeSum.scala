package lp.algotasks.interviewbit

import scala.collection.mutable.ArrayBuffer

/**
  * Prime Sum
  *
  * [https://www.interviewbit.com/problems/prime-sum]
  */
object PrimeSum {

  def primesum(A: Int): Array[Int]  = {
    val primes = getPrimes(A)

    val primesIndex = primes.toSet

    for (prime <- primes) {
      if (primesIndex.contains(A - prime)) return Array(prime, A - prime)
    }

    throw new IllegalArgumentException(f"Solution not found for $A")
  }

  private def getPrimes(A: Int): Array[Int]  = {
    if (A <= 1) return Array()
    if (A == 2) return Array(2)

    val primesIdx = Array.fill(A + 1)(true)
    val sqrtA = Math.sqrt(A).toInt

    for (i <- 2 to sqrtA) {
      if (primesIdx(i)) {
        for (j <- 2 to (A / i)) {
          primesIdx(i * j) = false
        }
      }
    }

    val primes = ArrayBuffer[Int]()
    for (i <- 2 to A) {
      if (primesIdx(i)) primes.append(i)
    }

    primes.toArray
  }

}
