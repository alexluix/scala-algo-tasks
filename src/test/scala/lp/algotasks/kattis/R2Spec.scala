package lp.algotasks.kattis

import org.scalatest.FlatSpec

class R2Spec extends FlatSpec {

  val subject: R2.type = R2

  it should "find lost integer 1" in {
    assert(subject.find(r1 = 11, s = 15) === 19)
  }

  it should "find lost integer 2" in {
    assert(subject.find(r1 = 4, s = 3) === 2)
  }

}
