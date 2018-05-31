package lp.algotasks.kattis

import org.scalatest.FlatSpec

class RacingAroundTheAlphabetSpec extends FlatSpec {

  val subject: RacingAroundTheAlphabet.type = RacingAroundTheAlphabet

  it should "estimate sample phrase 1 correctly" in {
    val result = subject.estimate("WINNING ISN'T EVERYTHING IT'S THE ONLY THING")

    val expected: Double = 187.6156641641D
    assert(f"$result%1.6f" === f"$expected%1.6f")
  }

  it should "estimate sample phrase 2 correctly" in {
    val result = subject.estimate("WINNERS DON'T WAIT FOR CHANCES THEY TAKE THEM")

    val expected: Double = 190.4108599662D
    assert(f"$result%1.6f" === f"$expected%1.6f")
  }

  it should "estimate sample phrase 3 correctly" in {
    val result = subject.estimate("PAIN IS ONLY TEMPORARY BUT VICTORY IS FOREVER")

    val expected: Double = 193.1036536692D
    assert(f"$result%1.6f" === f"$expected%1.6f")
  }

  it should "estimate one letter phrase" in {
    val result = subject.estimate("W")

    assert(result === 1)
  }

  it should "estimate two neighbour letters phrase" in {
    val result = subject.estimate("AB")

    val expected: Double = 2.448799D
    assert(f"$result%1.6f" === f"$expected%1.6f")
  }

}
