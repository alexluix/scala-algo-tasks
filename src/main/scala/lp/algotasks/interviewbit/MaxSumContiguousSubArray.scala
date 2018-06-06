package lp.algotasks.interviewbit

/**
  * Max Sum Contiguous Subarray
  *
  * [https://www.interviewbit.com/problems/max-sum-contiguous-subarray]
  */
object MaxSumContiguousSubArray {

  def maxSubArray(A: Array[Int]): Int  = {
    var maxSum = A(0)
    var currentSum = A(0)
    for (i <- 1 until A.length) {
      val number = A(i)
      if (number > currentSum + number) currentSum = number else currentSum += number

      maxSum = Math.max(maxSum, currentSum)
    }

    maxSum
  }

}
