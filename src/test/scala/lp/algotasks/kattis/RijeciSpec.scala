package lp.algotasks.kattis

import org.scalatest.FlatSpec

class RijeciSpec extends FlatSpec {

  private val subject: Rijeci.type = Rijeci

  it should "calculate numbers of A and B letters" in {
    assert(subject.pressAndCalculate(0) === (1, 0))
    assert(subject.pressAndCalculate(1) === (0, 1))
    assert(subject.pressAndCalculate(4) === (2, 3))
    assert(subject.pressAndCalculate(10) === (34, 55))
  }

}
