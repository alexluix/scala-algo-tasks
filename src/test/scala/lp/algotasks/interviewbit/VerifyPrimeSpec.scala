package lp.algotasks.interviewbit

import org.scalatest.FlatSpec

class VerifyPrimeSpec extends FlatSpec {

  val subject: VerifyPrime.type = VerifyPrime

  it should "find out that 2 is prime" in {
    assert(subject.isPrime(2) === 1)
  }

  it should "find out that 3 is prime" in {
    assert(subject.isPrime(3) === 1)
  }

  it should "find out that 4 is not prime" in {
    assert(subject.isPrime(4) === 0)
  }

  it should "find out that 6 is not prime" in {
    assert(subject.isPrime(6) === 0)
  }

  it should "find out that 73 is prime" in {
    assert(subject.isPrime(73) === 1)
  }

  it should "find out that 84923 is not prime" in {
    assert(subject.isPrime(84923) === 0)
  }

  it should "find out that 16777214 is not prime" in {
    assert(subject.isPrime(16777214) === 0)
  }

  it should "find out that large number 1300141 is prime" in {
    assert(subject.isPrime(1300141) === 1)
  }

  it should "find out that 31 is prime" in {
    assert(subject.isPrime(31) === 1)
  }

}
