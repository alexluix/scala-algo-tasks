package lp.algotasks.kattis

/**
  * Riječi
  *
  * [https://open.kattis.com/problems/rijeci]
 */
object Rijeci {

  val stdIn: scala.io.StdIn.type = scala.io.StdIn

  def main(args: Array[String]): Unit = {
    val n = stdIn.readLine().toInt

    val (numberOfA: Int, numberOfB: Int) = pressAndCalculate(n)

    Console.out.println(f"$numberOfA $numberOfB")
  }

  def pressAndCalculate(times: Int): (Int, Int) = {
    var a = 1
    var b = 0

    for (_ <- 0 until times) {
      val prevB = b

      b = a
      a += prevB
    }

    (a - b, b)
  }

}
