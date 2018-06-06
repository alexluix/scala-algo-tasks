package lp.algotasks.interviewbit

import org.scalatest.FlatSpec

class AllFactorsSpec extends FlatSpec {

  val subject: AllFactors.type = AllFactors

  it should "calculate factors of 2" in {
    assert(subject.allFactors(2) === Array(1, 2))
  }

  it should "calculate factors of 6" in {
    assert(subject.allFactors(6) === Array(1, 2, 3, 6))
  }

  it should "calculate factors of 36" in {
    assert(subject.allFactors(36) === Array(1, 2, 3, 4, 6, 9, 12, 18, 36))
  }

  it should "calculate factors of 72" in {
    assert(subject.allFactors(72) === Array(1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72))
  }

  it should "calculate factors of prime 13" in {
    assert(subject.allFactors(13) === Array(1, 13))
  }

  it should "calculate factors of prime 31" in {
    assert(subject.allFactors(31) === Array(1, 31))
  }

}
