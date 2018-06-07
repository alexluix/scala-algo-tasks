package lp.algotasks.interviewbit.math

import org.scalatest.FlatSpec

class ExcelColumnNumberSpec extends FlatSpec {

  val subject: ExcelColumnNumber.type = ExcelColumnNumber

  it should "map first letters of alphabet A, B, C" in {
    assert(subject.titleToNumber("A") === 1)
    assert(subject.titleToNumber("B") === 2)
    assert(subject.titleToNumber("C") === 3)
  }

  it should "map two-letter codes AA, AB, AC, BB" in {
    assert(subject.titleToNumber("AA") === 27)
    assert(subject.titleToNumber("AB") === 28)
    assert(subject.titleToNumber("AC") === 29)
    assert(subject.titleToNumber("BB") === 54)
  }

  it should "map large codes ABC, ABCDE, CCCE" in {
    assert(subject.titleToNumber("ABC") === 731)
    assert(subject.titleToNumber("ABCDE") === 494265)
    assert(subject.titleToNumber("CCCE") === 54839)
  }

}
