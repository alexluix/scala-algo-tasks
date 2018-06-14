package lp.algotasks.interviewbit.binarysearch

import org.scalatest.FlatSpec

class SearchForRangeSpec extends FlatSpec {

  val subject: SearchForRange.type = SearchForRange

  it should "find unique number" in {
    val list = List(1, 2, 3, 4, 5)
    val (start, end) = subject.searchRange(list, 3)

    assert(start === 2)
    assert(end === 2)
  }

  it should "find duplicated number" in {
    val list = List(1, 2, 3, 3, 4, 5)
    val (start, end) = subject.searchRange(list, 3)

    assert(start === 2)
    assert(end === 3)
  }

  it should "find duplicated number from the beginning" in {
    val list = List(1, 1, 1, 2, 3, 3, 4, 5)
    val (start, end) = subject.searchRange(list, 1)

    assert(start === 0)
    assert(end === 2)
  }

  it should "find duplicated number at the ending" in {
    val list = List(1, 2, 2, 3, 3, 4, 5, 5, 5, 5)
    val (start, end) = subject.searchRange(list, 5)

    assert(start === 6)
    assert(end === 9)
  }

  it should "not find absent number" in {
    val list = List(4, 7, 7, 7, 8, 10, 10)
    val (start, end) = subject.searchRange(list, 3)

    assert(start === -1)
    assert(end === -1)
  }

  it should "find duplicated number in a long list" in {
    val list = List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    val (start, end) = subject.searchRange(list, 8)

    assert(start === 154)
    assert(end === 183)
  }

}
