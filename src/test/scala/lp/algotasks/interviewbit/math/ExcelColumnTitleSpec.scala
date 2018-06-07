package lp.algotasks.interviewbit.math

import org.scalatest.FlatSpec

class ExcelColumnTitleSpec extends FlatSpec {

  val subject: ExcelColumnTitle.type = ExcelColumnTitle

  it should "convert simple cases: 1, 2, 3, 5" in {
    assert(subject.convertToTitle(1) === "A")
    assert(subject.convertToTitle(2) === "B")
    assert(subject.convertToTitle(3) === "C")
    assert(subject.convertToTitle(5) === "E")
  }

  it should "convert two-letters cases: 27, 28, 54, 55" in {
    assert(subject.convertToTitle(27) === "AA")
    assert(subject.convertToTitle(28) === "AB")
    assert(subject.convertToTitle(54) === "BB")
    assert(subject.convertToTitle(55) === "BC")
  }

  it should "convert large number cases: 494265, 54839, 731" in {
    assert(subject.convertToTitle(494265) === "ABCDE")
    assert(subject.convertToTitle(54839) === "CCCE")
    assert(subject.convertToTitle(731) === "ABC")
  }

  it should "convert special case: 943566" in {
    assert(subject.convertToTitle(943566) === "BAQTZ")
  }

}
