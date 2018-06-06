package lp.algotasks.interviewbit

import scala.collection.mutable.ArrayBuffer

/**
  * Max Non Negative Sub Array
  *
  * [https://www.interviewbit.com/problems/max-non-negative-subarray]
  */
object MaxNonNegativeSubArray {

  def maxset(A: Array[Int]): Array[Int] = {
    val subArray = ArrayBuffer[Int]()

    var maxSubArray = Array[Int]()
    var maxSubArraySum: Long = 0

    for (number <- A) {
      if (number >= 0) subArray.append(number) else setMax
    }
    setMax

    def setMax = {
      val subArraySum: Long = subArray.map(_.toLong).sum

      if (maxSubArraySum < subArraySum ||
        (maxSubArraySum == subArraySum && maxSubArray.length < subArray.length)) {

        maxSubArray = subArray.toArray
        maxSubArraySum = maxSubArray.map(_.toLong).sum
      }

      subArray.clear
    }

    maxSubArray
  }

}
