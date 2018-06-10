package lp.algotasks.interviewbit.string

import org.scalatest.FlatSpec

class PalindromeStringSpec extends FlatSpec {

  val subject: PalindromeString.type = PalindromeString

  it should "resolve simple cases" in {
    assert(subject.isPalindrome("a") === 1)
    assert(subject.isPalindrome("aba") === 1)
    assert(subject.isPalindrome("abba") === 1)
    assert(subject.isPalindrome("abbba") === 1)
    assert(subject.isPalindrome("abbca") === 0)
  }

  it should "resolve basic phrase with different letter cases" in {
    assert(subject.isPalindrome("A man, a plan, a canal: Panama") === 1)
  }

  it should "resolve basic negative phrase case" in {
    assert(subject.isPalindrome("race a car") === 0)
  }

  it should "resolve cases with digits" in {
    assert(subject.isPalindrome("1a2") === 0)
    assert(subject.isPalindrome("1a1") === 1)
  }

}
