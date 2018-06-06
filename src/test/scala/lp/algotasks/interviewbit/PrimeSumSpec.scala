package lp.algotasks.interviewbit

import org.scalatest.FlatSpec

class PrimeSumSpec extends FlatSpec {

  val subject: PrimeSum.type = PrimeSum

  it should "find two prime numbers whose sum will be equal to 4" in {
    assert(subject.primesum(4) === Array(2, 2))
  }

  it should "find two prime numbers whose sum will be equal to 10" in {
    assert(subject.primesum(10) === Array(3, 7))
  }

  it should "find two prime numbers whose sum will be equal to 14" in {
    assert(subject.primesum(14) === Array(3, 11))
  }

  it should "find two prime numbers whose sum will be equal to 16777214" in {
    assert(subject.primesum(16777214) === Array(31, 16777183))
  }

}
