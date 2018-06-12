package lp.algotasks.interviewbit.string

import org.scalatest.FlatSpec

class ReverseStringSpec extends FlatSpec {

  val subject: ReverseString = new ReverseString

  it should "resolve one-word case" in {
    assert(subject.reverseWords("simple") === "simple")
    assert(subject.reverseWords(" car ") === "car")
    assert(subject.reverseWords(" motocycle") === "motocycle")
  }

  it should "resolve two-words with spaces cases" in {
    assert(subject.reverseWords("drive a car") === "car a drive")
    assert(subject.reverseWords("  drive a car") === "car a drive")
    assert(subject.reverseWords("drive a car  ") === "car a drive")
    assert(subject.reverseWords("drive a   car") === "car a drive")
  }

  it should "resolve multi-words with digits cases" in {
    assert(subject.reverseWords("drive 12 a car") === "car a 12 drive")
    assert(subject.reverseWords("drive a001 car") === "car a001 drive")
  }

  it should "resolve multi-words cases" in {
    assert(subject.reverseWords("the sky is blue") === "blue is sky the")
    assert(subject.reverseWords("the main thing is") === "is thing main the")
  }

}
