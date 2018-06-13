package lp.algotasks.bigmachine.datastructurereview

import org.scalatest.FlatSpec

class QueueSpec extends FlatSpec {

  it should "enqueue and dequeue a single element" in {
    val subject: Queue[Int] = Queue()
    subject.enqueue(5)

    assert(subject.peek().get === 5)
    assert(subject.dequeue().get === 5)
    assert(subject.dequeue().isDefined === false)
  }

  it should "orderly enqueue elements" in {
    val subject: Queue[Int] = Queue()
    subject.enqueue(5)
    subject.enqueue(6)
    subject.enqueue(7)

    assert(subject.peek().get === 5)
    assert(subject.dequeue().get === 5)
    assert(subject.peek().get === 6)
    assert(subject.dequeue().get === 6)
    assert(subject.peek().get === 7)
    assert(subject.dequeue().get === 7)
    assert(subject.dequeue().isDefined === false)
  }

}
