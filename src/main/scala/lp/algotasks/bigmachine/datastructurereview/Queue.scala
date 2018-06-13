package lp.algotasks.bigmachine.datastructurereview

// Make me a queue

object Queue {
  def apply[T](): Queue[T] = new Queue[T]()
}

class Queue[T] {

  private val list = DoubleLinkedList[T]()

  def enqueue(element: T): Unit = {
    list.append(element)
  }

  def dequeue(): Option[T] = {
    if (list.head == null) return None

    val head = list.head
    list.remove(head)

    Some(head.value)
  }

  def peek(): Option[T] = if (list.head != null) Some(list.head.value) else None

}
