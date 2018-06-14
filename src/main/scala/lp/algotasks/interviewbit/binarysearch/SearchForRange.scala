package lp.algotasks.interviewbit.binarysearch

object SearchForRange {

  def searchRange(a: List[Int], b: Int): (Int, Int) = {
    val position = searchIteration(a, b)
    var startPosition = position
    var endPosition = position
    if (position >= 0) {
      startPosition = findLeftNeighbours(a, position, b)
      endPosition = findRightNeighbours(a, position, b)
    }

    (startPosition, endPosition)
  }

  private def findLeftNeighbours(a: List[Int], position: Int, target: Int): Int = {
    var leftPosition = position
    for (i <- position.to(0, -1)) {
      if (a(i) == target) leftPosition = i else return leftPosition
    }

    leftPosition
  }

  private def findRightNeighbours(a: List[Int], position: Int, target: Int): Int = {
    var rightPosition = position
    for (i <- position until a.size) {
      if (a(i) == target) rightPosition = i else return rightPosition
    }

    rightPosition
  }

  private def searchIteration(list: List[Int], target: Int): Int = {
    var start: Int = 0
    var end: Int = list.size - 1

    while (start <= end) {
      val mid: Int = (start + end) / 2
      val midElement: Integer = list(mid)

      if (midElement < target) start = mid + 1
      else if (midElement > target) end = mid - 1
      else return mid
    }

    -1
  }

}
