package lp.algotasks.kattis

import org.scalatest.FlatSpec

class AutoriSpec extends FlatSpec {

  val subject: Autori.type = Autori

  it should "create acronym for basic cases" in {
    assert(subject.transform("Knuth-Morris-Pratt") === "KMP")
    assert(subject.transform("Mirko-Slavko") === "MS")
    assert(subject.transform("Pasko-Patak") === "PP")
  }

}
