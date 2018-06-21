package lp.algotasks.interviewcake

import org.scalatest.FlatSpec

class StockPricesYesterdaySpec extends FlatSpec {

  val subject: StockPricesYesterday.type = StockPricesYesterday

  it should "resolve simple case" in {
    val prices = Array(10, 7, 5, 8, 11, 9)
    val profit = subject.getMaxProfit(prices)
    assert(profit === 6)
  }

}
