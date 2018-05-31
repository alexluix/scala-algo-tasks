package lp.algotasks.strings

import org.scalatest.FlatSpec

class UniqueStringSpec extends FlatSpec {

  private val subject: UniqueString.type = UniqueString

  "UniqueString" should "return true when all characters unique" in {
    val unique = subject.uniqueCharacters("abcd")
    assert(unique === true)
  }

  it should "return true for empty string" in {
    assert(subject.uniqueCharacters("") === true)
  }

  it should "return false in case of single duplicate" in {
    assert(subject.uniqueCharacters("abccd") === false)
  }

  it should "return false in case of multiple duplicates" in {
    assert(subject.uniqueCharacters("abccdd") === false)
  }

}
