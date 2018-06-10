package lp.algotasks.interviewbit.string

import org.scalatest.FlatSpec

class LengthOfLastWordSpec extends FlatSpec {

  val subject: LengthOfLastWord.type = LengthOfLastWord

  it should "resolve one word cases" in {
    assert(subject.lengthOfLastWord("") === 0)
    assert(subject.lengthOfLastWord("Hello ") === 5)
    assert(subject.lengthOfLastWord("A") === 1)
  }

  it should "resolve two word cases" in {
    assert(subject.lengthOfLastWord("Hello World  ") === 5)
    assert(subject.lengthOfLastWord(" Hello A") === 1)
    assert(subject.lengthOfLastWord("I am, fine ") === 4)
  }

}
