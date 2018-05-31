package lp.algotasks.kattis

/**
  * Autori
  *
  * [https://open.kattis.com/problems/autori]
  */
object Autori {

  val stdIn: scala.io.StdIn.type = scala.io.StdIn

  def main(args: Array[String]): Unit = {
    var line = stdIn.readLine()

    while (line != null) {
      val result = transform(line)

      Console.out.println(result)

      line = stdIn.readLine()
    }
  }

  def transform(string: String): String = string.split("-").map(_.charAt(0)).foldLeft[String]("")(_ + _)

}
