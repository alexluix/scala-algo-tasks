package lp.algotasks.interviewbit.array

import org.scalatest.FlatSpec

class PrettyPrintSpec extends FlatSpec {

  val subject: PrettyPrint.type = PrettyPrint

  it should "print edge case – matrix of 1" in {
    val array = subject.prettyPrint(1)

    assert(array.length == 1)
    assert(array(0) === Array(1))
  }

  it should "print edge case – matrix of 2" in {
    val array = subject.prettyPrint(2)

    assert(array.length == 3)
    assert(array(0) === Array(2, 2, 2))
    assert(array(1) === Array(2, 1, 2))
    assert(array(2) === Array(2, 2, 2))
  }

  it should "print simple matrix of 3" in {
    val array = subject.prettyPrint(3)

    assert(array.length == 5)
    assert(array(0) === Array(3, 3, 3, 3, 3))
    assert(array(1) === Array(3, 2, 2, 2, 3))
    assert(array(2) === Array(3, 2, 1, 2, 3))
    assert(array(3) === Array(3, 2, 2, 2, 3))
    assert(array(4) === Array(3, 3, 3, 3, 3))
  }

  it should "print simple matrix of 4" in {
    val array = subject.prettyPrint(4)

    assert(array.length == 7)
    assert(array(0) === Array(4, 4, 4, 4, 4, 4, 4))
    assert(array(1) === Array(4, 3, 3, 3, 3, 3, 4))
    assert(array(2) === Array(4, 3, 2, 2, 2, 3, 4))
    assert(array(3) === Array(4, 3, 2, 1, 2, 3, 4))
    assert(array(4) === Array(4, 3, 2, 2, 2, 3, 4))
    assert(array(5) === Array(4, 3, 3, 3, 3, 3, 4))
    assert(array(6) === Array(4, 4, 4, 4, 4, 4, 4))
  }

}
