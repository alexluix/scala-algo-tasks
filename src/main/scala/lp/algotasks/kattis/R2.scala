package lp.algotasks.kattis

/**
  * R2
  *
  * [https://open.kattis.com/problems/r2]
  */
object R2 {

  val stdIn: scala.io.StdIn.type = scala.io.StdIn

  def main(args: Array[String]): Unit = {
    var line = stdIn.readLine()

    while (line != null) {
      val Array(r1, s) = line.split(" ").map(_.toInt)

      val r2 = find(r1, s)

      Console.out.println(r2)

      line = stdIn.readLine()
    }

  }

  def find(r1: Int, s: Int): Int = s * 2 - r1

}
