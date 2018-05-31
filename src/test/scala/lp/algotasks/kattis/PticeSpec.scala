package lp.algotasks.kattis

import org.scalatest.FlatSpec

class PticeSpec extends FlatSpec {

  it should "correctly assess single answer result" in {
    val (number, names) = Ptice.assess("A")

    assert(number === 1)
    assert(names.length === 1)
    assert(names(0) === "Adrian")
  }

  it should "correctly assess answer result matching Adrian" in {
    val (number, names) = Ptice.assess("ABC")

    assert(number === 3)
    assert(names.length === 1)
    assert(names(0) === "Adrian")
  }

  it should "correctly assess answer result matching Adrian twice long" in {
    val (number, names) = Ptice.assess("ABCABCBCB")

    assert(number === 6)
    assert(names.length === 1)
    assert(names(0) === "Adrian")
  }

  it should "correctly assess answer result matching Bruno passing Adrian" in {
    val (number, names) = Ptice.assess("ABCABCABCABCBABCBABCBABC")

    assert(number === 16)
    assert(names.length === 2)
    assert(names.contains("Adrian"))
    assert(names.contains("Bruno"))
  }

  it should "correctly assess answer result matching Bruno with 3" in {
    val (number, names) = Ptice.assess("BAB")

    assert(number === 3)
    assert(names.length === 1)
    assert(names(0) === "Bruno")
  }

  it should "correctly assess answer result matching all guys with 4" in {
    val (number, names) = Ptice.assess("AAAABBBBB")

    assert(number === 4)
    assert(names.length === 3)
    assert(names(0) === "Adrian")
    assert(names(1) === "Bruno")
    assert(names(2) === "Goran")
  }

}
