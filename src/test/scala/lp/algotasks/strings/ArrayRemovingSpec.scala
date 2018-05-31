package lp.algotasks.strings

import org.scalatest.FlatSpec

class ArrayRemovingSpec extends FlatSpec {

  "ArrayRemoving" should "do nothing with empty array" in {
    val emptyArray = Array[Int]()
    ArrayRemoving.removeCharacters(emptyArray, 5)

    assert(emptyArray.isEmpty)
  }

  it should "remove single element equal to X" in {
    val array = Array(7, 8, 9, 5, 1, 3, 7)
    ArrayRemoving.removeCharacters(array, 5)

    assert(array === Array(7, 8, 9, 1, 3, 7, 0))
  }

  it should "remove subsequent elements equal to X" in {
    val array = Array(7, 8, 9, 5, 5, 1, 3, 7)
    ArrayRemoving.removeCharacters(array, 5)

    assert(array === Array(7, 8, 9, 1, 3, 7, 0, 0))
  }

  it should "remove several elements equal to X" in {
    val array = Array(7, 5, 8, 9, 5, 1, 3, 7)
    ArrayRemoving.removeCharacters(array, 5)

    assert(array === Array(7, 8, 9, 1, 3, 7, 0, 0))
  }

  it should "remove several elements equal to X including some at the beginning" in {
    val array = Array(5, 5, 7, 8, 5, 9, 5, 1, 3, 7)
    ArrayRemoving.removeCharacters(array, 5)

    assert(array === Array(7, 8, 9, 1, 3, 7, 0, 0, 0, 0))
  }

  it should "remove the only element if it equal to X" in {
    val array = Array[Int](5)
    ArrayRemoving.removeCharacters(array, 5)

    assert(array === Array(0))
  }

}
