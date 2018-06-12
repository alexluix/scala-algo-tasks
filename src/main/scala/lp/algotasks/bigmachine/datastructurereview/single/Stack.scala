package lp.algotasks.bigmachine.datastructurereview.single

// Make me a Stack

object Stack {
  def apply[T](): Stack[T] = new Stack[T]()
}

class Stack[T] {

  private val list: LinkedList[T] = LinkedList[T]()

  def push(element: T): Unit = {
    list.head = Node(element, list.head)
  }

  def pop(): Option[T] = {
    val element = peek()
    if (element.isDefined) {
      list.remove(list.head)
    }

    element
  }

  def peek(): Option[T] = if (list.head != null) Some(list.head.value) else None

}
