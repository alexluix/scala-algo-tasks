package lp.algotasks.interviewbit

import scala.collection.mutable.ArrayBuffer

/**
  * All Factors
  *
  * [https://www.interviewbit.com/problems/all-factors]
  */
object AllFactors {

  def allFactors(A: Int): Array[Int]  = {
    val sqrtA = Math.sqrt(A)
    val factors = ArrayBuffer[Int]()

    for (i <- 1 to sqrtA.floor.toInt) {
      if (A % i == 0) {
        factors.append(i)

        if (i != A / i) factors.append(A / i)
      }
    }

    factors.sorted.toArray
  }

}
