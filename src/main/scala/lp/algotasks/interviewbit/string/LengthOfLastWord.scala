package lp.algotasks.interviewbit.string

/**
  * Length of Last Word
  *
  * [https://www.interviewbit.com/problems/length-of-last-word]
  */
object LengthOfLastWord {

  def lengthOfLastWord(A: String): Int  = {
    var prevLength = 0
    var length = 0
    for (i <- 0 until A.length) {
      val char = A(i)
      if (char.isWhitespace) {
        if (length > 0) {
          prevLength = length
          length = 0
        }
      } else {
        length += 1
      }
    }

    if (length > 0) length else prevLength
  }

}
