package lp.algotasks.bigmachine.datastructurereview.interviewcake

import org.scalatest.FlatSpec

/**
  * Given a 2d grid map of ‘1’s (land) and '0’s (water), count the number of islands.
  * An island is surrounded by water and is formed by connecting adjacent lands
  * horizontally or vertically. You may assume all four edges of the grid are all
  * surrounded by water.
  *
  * Examples:
  *
  * 1.
  * ocean = [
  * [1,1,1,1,0],
  * [1,1,0,1,0],
  * [1,1,0,0,0],
  * [0,0,0,0,0]
  * ];
  *
  * Result: 1
  *
  * 2.
  * ocean2 = [
  * [1,1,0,0,0],
  * [1,1,0,0,0],
  * [0,0,1,0,0],
  * [0,0,0,1,1]
  * ];
  *
  * Result: 3
  *
  */
class IslandsInTheSeaSpec extends FlatSpec {

  private val subject = new IslandsInTheSea

  it should "throw error when map is invalid" in {
    assertThrows[IllegalArgumentException] {
      subject.countIslands(Array[Array[Int]]())
    }
  }

  it should "throw error when map is incorrectly sized" in {
    assertThrows[IllegalArgumentException] {
      subject.countIslands(Array[Array[Int]](
        Array(0, 0, 1),
        Array(0, 0, 1),
        Array(0, 0))
      )
    }
  }

  it should "count single island" in {
    val numberOfIslands = subject.countIslands(Array[Array[Int]](
      Array(0, 1, 0),
      Array(0, 1, 0),
      Array(0, 0, 0))
    )

    numberOfIslands === 1
  }

  it should "count single island of a complicated shape" in {
    val numberOfIslands = subject.countIslands(Array[Array[Int]](
      Array(1, 1, 1, 1, 0),
      Array(1, 1, 0, 1, 0),
      Array(1, 1, 0, 0, 0),
      Array(0, 0, 0, 0, 0))
    )

    numberOfIslands === 1
  }

  it should "count single island of a U-shape" in {
    val numberOfIslands = subject.countIslands(Array[Array[Int]](
      Array(1, 1, 0, 0, 0),
      Array(1, 1, 0, 0, 0),
      Array(0, 0, 1, 0, 1),
      Array(0, 0, 1, 1, 1))
    )

    numberOfIslands === 2
  }

  it should "count multiple islands" in {
    val numberOfIslands = subject.countIslands(Array[Array[Int]](
      Array(1, 1, 0, 0, 0),
      Array(1, 1, 0, 0, 0),
      Array(0, 0, 1, 0, 0),
      Array(0, 0, 0, 1, 1))
    )

    numberOfIslands === 3
  }

}
