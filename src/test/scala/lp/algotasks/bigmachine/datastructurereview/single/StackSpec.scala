package lp.algotasks.bigmachine.datastructurereview.single

import org.scalatest.FlatSpec

class StackSpec extends FlatSpec {

  it should "peek and pop empty stack correctly" in {
    val subject: Stack[Int] = Stack()
    assert(subject.peek() === None)
    assert(subject.pop() === None)
  }

  it should "push and peek / pop elements" in {
    val subject: Stack[Int] = Stack()
    subject.push(5)
    subject.push(7)
    assert(subject.peek().get === 7)
    assert(subject.peek().get === 7)
    assert(subject.pop().get === 7)
    assert(subject.peek().get === 5)
    assert(subject.pop().get === 5)
    assert(subject.pop() === None)
    assert(subject.peek() === None)
  }

}
