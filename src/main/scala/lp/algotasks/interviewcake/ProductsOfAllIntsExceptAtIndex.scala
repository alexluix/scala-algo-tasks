package lp.algotasks.interviewcake

/**
  * See test for task definition.
  */
object ProductsOfAllIntsExceptAtIndex {

  def getProductsOfAllIntsExceptAtIndex(numbers: Array[Int]): Array[Int] = {
    if (numbers == null || numbers.length <= 1) throw new IllegalArgumentException

    var product: Int = 1
    val products = Array.fill(numbers.length)(1)

    for (i <- numbers.indices) {
      val number = numbers(i)
      products(i) *= product
      product *= number
    }

    product = 1
    for (i <- (numbers.length - 1) to(0, -1)) {
      val number = numbers(i)
      products(i) *= product
      product *= number
    }

    products
  }

}
