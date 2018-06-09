package lp.algotasks.interviewbit.array

/**
  * Pretty Print
  *
  * [https://www.interviewbit.com/problems/prettyprint]
  */
object PrettyPrint {

  def prettyPrint(A: Int): Array[Array[Int]] = {
    val size = A * 2 - 1
    val array = new Array[Array[Int]](size)

    for (iRow <- 0 until size) {
      val row = new Array[Int](size)
      val matrixRow = idx(A, iRow + 1)

      for (iCol <- 0 until size) {
        val matrixCol = idx(A, iCol + 1)
        row(iCol) = A - (Math.min(matrixCol, matrixRow) - 1)
      }

      array(iRow) = row
    }

    array
  }

  private def idx(A: Int, i: Int) = if (i > A) A - i % A else i

}
