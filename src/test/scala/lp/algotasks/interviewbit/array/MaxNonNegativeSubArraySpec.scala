package lp.algotasks.interviewbit.array

import org.scalatest.FlatSpec

class MaxNonNegativeSubArraySpec extends FlatSpec {

  val subject: MaxNonNegativeSubArray.type = MaxNonNegativeSubArray

  it should "find max non-negative sub-array for a trivial array" in {
    val subArray = subject.maxset(Array[Int](1, 2, 5, -7, 2, 3))

    assert(subArray === Array[Int](1, 2, 5))
  }

  it should "find max non-negative sub-array for an array with large numbers" in {
    val subArray = subject.maxset(Array[Int](1967513926, 1540383426, -1303455736, -521595368))

    assert(subArray === Array[Int](1967513926, 1540383426))
  }

  it should "choose max sum sub-array in case when the other one is of the same size" in {
    val subArray = subject.maxset(Array[Int](756898537, -1973594324, -2038664370, -184803526, 1424268980))

    assert(subArray === Array[Int](1424268980))
  }

  it should "find max non-negative sub-array for an array with a lot of large numbers" in {
    val subArray = subject.maxset(Array[Int](
      336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069,
      1059961393, 628175011, -1131176229, -859484421))

    assert(subArray === Array[Int](1101513929, 1315634022))
  }

}
