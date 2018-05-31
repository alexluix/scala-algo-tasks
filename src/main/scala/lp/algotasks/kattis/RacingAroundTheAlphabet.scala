package lp.algotasks.kattis

/**
  * Racing Around the Alphabet
  *
  * [https://open.kattis.com/problems/racingalphabet]
  */
object RacingAroundTheAlphabet {

  val chars: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '"

  val diameter: Double = 60.0
  val circumference: Double = Math.PI * diameter

  val maxPosition: Int = 28
  val speedPerSecond: Int = 15

  val pickUpTime = 1

  val stdIn: scala.io.StdIn.type = scala.io.StdIn

  def main(args: Array[String]): Unit = {
    val n = stdIn.readLine().toInt

    for (_: Int <- 1 to n) {
      val phrase = stdIn.readLine()

      val result = estimate(phrase)

      Console.out.println(f"$result%1.6f")
    }

  }

  def estimate(string: String) : Double = {
    val charArray = string.toCharArray

    var estimateSeconds: Double = 0
    var currentPosition = find(charArray(0))

    for (char <- charArray) {
      val targetPosition = find(char)
      val steps = minimumSteps(currentPosition, targetPosition)

      val travelDistance = steps * circumference / maxPosition
      val travelTime = travelDistance / speedPerSecond
      estimateSeconds += pickUpTime + travelTime

      currentPosition = targetPosition
    }

    estimateSeconds
  }

  def find(c: Char): Int = chars.indexOf(c)

  def minimumSteps(currentPosition: Int, targetPosition: Int): Double =
    Math.min(Math.abs(currentPosition - targetPosition), maxPosition - Math.abs(currentPosition - targetPosition))

}
