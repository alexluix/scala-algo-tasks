package lp.algotasks.interviewbit.string

import org.scalatest.FlatSpec

class LongestCommonPrefixSpec extends FlatSpec {

  val subject: LongestCommonPrefix.type = LongestCommonPrefix

  it should "resolve simple cases" in {
    assert(subject.longestCommonPrefix(Array("a", "a", "a")) === "a")
    assert(subject.longestCommonPrefix(Array("abc", "add", "azz")) === "a")
    assert(subject.longestCommonPrefix(Array("bbaaa", "bb12", "bb")) === "bb")
  }

  it should "resolve more interesting cases" in {
    assert(subject.longestCommonPrefix(Array("abcdefgh", "aefghijk", "abcefgh")) === "a")
    assert(subject.longestCommonPrefix(Array("abc12", "abc41", "abc")) === "abc")
    assert(subject.longestCommonPrefix(Array("aaabbb", "aaa", "aaa0")) === "aaa")
  }

}
