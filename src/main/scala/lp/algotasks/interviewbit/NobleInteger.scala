package lp.algotasks.interviewbit

/**
  * Noble Integer
  *
  * [https://www.interviewbit.com/problems/noble-integer]
  */
object NobleInteger {

  def solve(A: Array[Int]): Int  = {
    val reverseSortedA = A.sorted.reverse

    for (i <- reverseSortedA.indices) {
      if (reverseSortedA(i) == i && (i == 0 || reverseSortedA(i - 1) != i)) return 1
    }

    -1
  }

}
