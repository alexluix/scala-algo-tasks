package lp.algotasks.interviewcake

/**
  * Stock Price
  *
  * [https://www.interviewcake.com]
  */
object StockPricesYesterday {

  def getMaxProfit(prices: Array[Int]): Int = {
    if (prices == null || prices.length <= 1) return 0

    var locMin = prices(0)
    var maxProfit = 0

    for (price <- prices) {
      locMin = Math.min(locMin, price)
      maxProfit = Math.max(maxProfit, price - locMin)
    }

    maxProfit
  }

}
