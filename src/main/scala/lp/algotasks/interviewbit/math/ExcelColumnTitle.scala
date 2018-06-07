package lp.algotasks.interviewbit.math

/**
  * Excel Column Title
  *
  * [https://www.interviewbit.com/problems/excel-column-title]
  */
object ExcelColumnTitle {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def convertToTitle(A: Int): String  = {
    val base = alphabet.length

    var remainder = A
    val letters = StringBuilder.newBuilder

    while (remainder > base) {
      val index = remainder % base
      if (index == 0) {
        remainder -= base
      }
      remainder /= base

      val modIndex = if (index == 0) base else index
      letters.append(alphabet.charAt(modIndex - 1))
    }
    letters.append(alphabet.charAt(remainder - 1))

    letters.reverse.toString
  }

}
