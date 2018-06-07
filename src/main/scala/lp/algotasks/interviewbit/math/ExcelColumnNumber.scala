package lp.algotasks.interviewbit.math

/**
  * Excel Column Number
  *
  * [https://www.interviewbit.com/problems/excel-column-number]
  */
object ExcelColumnNumber {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def titleToNumber(A: String): Int  = {
    val base = alphabet.length

    var total = 0
    for (i <- 0 until A.length) {
      val char = A.charAt(i)
      val power = A.length - i - 1
      val number = alphabet.indexOf(char) + 1

      total += Math.pow(base, power).toInt * number
    }

    total
  }

}
