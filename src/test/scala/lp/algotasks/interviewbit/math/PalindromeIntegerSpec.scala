package lp.algotasks.interviewbit.math

import org.scalatest.FlatSpec

class PalindromeIntegerSpec extends FlatSpec {

  val subject: PalindromeInteger.type = PalindromeInteger

  it should "see that one digit number is a palindrome" in {
    assert(subject.isPalindrome(1) === 1)
    assert(subject.isPalindrome(2) === 1)
    assert(subject.isPalindrome(3) === 1)
    assert(subject.isPalindrome(8) === 1)
  }

  it should "see that two digit number is a palindrome only sometimes" in {
    assert(subject.isPalindrome(11) === 1)
    assert(subject.isPalindrome(55) === 1)
    assert(subject.isPalindrome(45) === 0)
    assert(subject.isPalindrome(90) === 0)
  }

  it should "see that multiple digit number is a palindrome only sometimes" in {
    assert(subject.isPalindrome(1001) === 1)
    assert(subject.isPalindrome(7447) === 1)
    assert(subject.isPalindrome(12321) === 1)
    assert(subject.isPalindrome(45643) === 0)
    assert(subject.isPalindrome(456000654) === 1)
  }

}
