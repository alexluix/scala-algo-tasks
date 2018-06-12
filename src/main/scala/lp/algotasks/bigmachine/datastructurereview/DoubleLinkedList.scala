package lp.algotasks.bigmachine.datastructurereview

// Make me a double-linked list

object DoubleLinkedList {
  def apply[T]() = new DoubleLinkedList[T](null)
}

class DoubleLinkedList[T](var head: Node[T]) {

  def apply(): DoubleLinkedList[T] = new DoubleLinkedList[T](null)

  def foreach(f: T => Unit): Unit = {
    traverse((current, _) => {
      f(current.value)
      false
    })
  }

  def foreachFromTail(f: T => Unit): Unit = {
    val last = traverse((_, _) => false)
    traverseBack(last, (current, _)  => {
      f(current.value)
      false
    })
  }

  def traverse(find: (Node[T], Node[T]) => Boolean): Node[T] = {
    var current = head
    var last: Node[T] = null

    var found = false
    while (!found && current != null) {
      found = find(current, last)
      last = current
      current = current.next
    }

    last
  }

  def traverseBack(node: Node[T], find: (Node[T], Node[T]) => Boolean): Node[T] = {
    var current = node
    var last: Node[T] = null

    var found = false
    while (!found && current != null) {
      found = find(current, last)
      last = current
      current = current.prev
    }

    last
  }

  def insertAt(node: Node[T], value: T): Node[T] = {
    // 1 <-> 2 <-> 7 <-> 3 <-> 4
    val newNode = new Node[T](value, node.next, node)
    if (node.next != null) {
      node.next.prev = newNode
    }
    node.next = newNode

    newNode
  }

  def size(): Int = {
    var size = 0
    traverse((_, _) => {
      size += 1
      false
    })

    size
  }

  def append(value: T): Node[T] = {
    val newNode = new Node[T](value, null, null)

    if (head == null) {
      head = newNode
    } else {
      //...3 <-> 4
      val last = traverse((_, _) => false)
      last.next = newNode
      newNode.prev = last
    }

    newNode
  }

  def remove(node: Node[T]): Unit = {
    if (head.value == node.value) {
      head = head.next
    } else {
      // 1 <-> 2 <-> 3 <-> 4
      if (node.prev != null) {
        node.prev.next = node.next
      }
      if (node.next != null) {
        node.next.prev = node.prev
      }
    }

  }

}

object Node {
  def apply[T](value: T): Node[T] = new Node(value, null, null)
}

class Node[T](val value: T, var next: Node[T], var prev: Node[T]) {
  override def toString: String = value.toString
}

