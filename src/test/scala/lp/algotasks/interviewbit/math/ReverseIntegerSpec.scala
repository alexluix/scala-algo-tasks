package lp.algotasks.interviewbit.math

import org.scalatest.FlatSpec

class ReverseIntegerSpec extends FlatSpec {

  val subject: ReverseInteger.type = ReverseInteger

  it should "reverse one digit numbers" in {
    assert(subject.reverse(1) === 1)
    assert(subject.reverse(2) === 2)
    assert(subject.reverse(3) === 3)
    assert(subject.reverse(7) === 7)
  }

  it should "reverse two digit numbers" in {
    assert(subject.reverse(12) === 21)
    assert(subject.reverse(72) === 27)
    assert(subject.reverse(30) === 3)
    assert(subject.reverse(79) === 97)
  }

  it should "reverse large numbers" in {
    assert(subject.reverse(12345) === 54321)
    assert(subject.reverse(72001) === 10027)
    assert(subject.reverse(30979) === 97903)
    assert(subject.reverse(79000) === 97)
  }

  it should "reverse negative numbers" in {
    assert(subject.reverse(-3) === -3)
    assert(subject.reverse(-72551) === -15527)
    assert(subject.reverse(-20979) === -97902)
    assert(subject.reverse(-79000) === -97)
  }

  it should "handle integer overflow" in {
    assert(subject.reverse(Int.MaxValue) === 0)
  }

}
