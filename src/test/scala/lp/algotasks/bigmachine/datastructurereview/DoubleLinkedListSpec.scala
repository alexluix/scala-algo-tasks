package lp.algotasks.bigmachine.datastructurereview

import org.scalatest.FlatSpec

class DoubleLinkedListSpec extends FlatSpec {

  it should "return size correctly" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    assert(subject.size === 0)
    subject.append(1)
    assert(subject.size === 1)
    subject.append(2)
    assert(subject.size === 2)
    subject.append(3)
    assert(subject.size === 3)
  }

  it should "execute foreach for every single element" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    subject.append(2)
    subject.append(3)

    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "123")
  }

  it should "remove from the middle of list correctly" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    val node2 = subject.append(2)
    subject.append(3)

    subject.remove(node2)

    assert(subject.size() == 2)
    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "13")
  }

  it should "insert in the middle of list correctly" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    val node2 = subject.append(2)
    subject.append(3)

    subject.insertAt(node2, 5)

    assert(subject.size() == 4)
    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "1253")
  }

  it should "set previous links correctly when append" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    subject.append(2)
    subject.append(3)
    assert(subject.size() == 3)

    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "123")

    val sb = StringBuilder.newBuilder
    subject.foreachFromTail(e => sb.append(e))
    assert(sb.toString() === "321")
  }

  it should "set previous links correctly when append and remove" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    val node2 = subject.append(2)
    subject.append(3)
    subject.remove(node2)
    assert(subject.size() == 2)

    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "13")

    val sb = StringBuilder.newBuilder
    subject.foreachFromTail(e => sb.append(e))
    assert(sb.toString() === "31")
  }

  it should "set previous links correctly when append and insertAt" in {
    val subject: DoubleLinkedList[Int] = DoubleLinkedList()
    subject.append(1)
    val node2 = subject.append(2)
    subject.append(3)
    subject.insertAt(node2, 7)
    assert(subject.size() == 4)

    val stringBuilder = StringBuilder.newBuilder
    subject.foreach(e => stringBuilder.append(e))
    assert(stringBuilder.toString() === "1273")

    val sb = StringBuilder.newBuilder
    subject.foreachFromTail(e => sb.append(e))
    assert(sb.toString() === "3721")
  }

}
