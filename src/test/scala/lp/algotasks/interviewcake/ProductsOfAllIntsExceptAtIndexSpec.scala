package lp.algotasks.interviewcake

import org.scalatest.FlatSpec

/**
  * You have an array of integers, and for each index you want to find
  * the product of every integer except the integer at that index.
  *
  * Example:
  *   Input: [1, 7, 3, 4]
  *   Output: [84, 12, 28, 21]
  *
  *   By calculating: [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
  *
  * You can't use division in your solution!
  *
  */
class ProductsOfAllIntsExceptAtIndexSpec extends FlatSpec {

  val subject: ProductsOfAllIntsExceptAtIndex.type = ProductsOfAllIntsExceptAtIndex

  it should "resolve basic case" in {
    val numbers = Array(1, 7, 3, 4)
    val products = subject.getProductsOfAllIntsExceptAtIndex(numbers)

    assert(products === Array(84, 12, 28, 21))
  }

  it should "resolve case with zero" in {
    val numbers = Array(0, 7, 3, 4)
    val products = subject.getProductsOfAllIntsExceptAtIndex(numbers)

    assert(products === Array(84, 0, 0, 0))
  }

}
