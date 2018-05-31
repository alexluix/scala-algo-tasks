package lp.algotasks.kattis

import scala.collection.mutable

/**
  * Ptice
  *
  * [https://open.kattis.com/problems/ptice]
  */
object Ptice {

  val stdIn: scala.io.StdIn.type = scala.io.StdIn

  def main(args: Array[String]): Unit = {
    val n = stdIn.readLine().toInt
    val answers = stdIn.readLine()

    val (max, names) = assess(answers.substring(0, n))

    Console.out.println(max)

    names.foreach(Console.out.println(_))
  }

  val patterns = Map(
    "Adrian" -> "ABC",
    "Bruno" -> "BABC",
    "Goran" -> "CCAABB"
  )

  def assess(answers: CharSequence): (Int, Array[String]) = {

    val results: mutable.Map[String, Int] = collection.mutable.Map[String, Int](
      "Adrian" -> 0,
      "Bruno" -> 0,
      "Goran" -> 0
    )

    for (i <- 0 until answers.length()) {
      for (p <- patterns) {
        val key = p._1
        val pattern = p._2
        if (pattern.charAt(i % pattern.length) == answers.charAt(i)) {
          results(key) = results(key) + 1
        }
      }
    }

    val max = results.values.max

    (max, results.filter(_._2 == max).keys.toList.sorted.toArray)
  }

}
