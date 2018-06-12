package lp.algotasks.bigmachine.datastructurereview.single

// Make me a single-linked list

object LinkedList {
  def apply[T]() = new LinkedList[T](null)
}

class LinkedList[T](var head: Node[T]) {

  def apply(): LinkedList[T] = new LinkedList[T](null)

  def foreach(f: T => Unit): Unit = {
    traverse((current, _) => {
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

  def insertAt(node: Node[T], value: T): Node[T] = {
    val newNode = new Node[T](value, node.next)
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
    val newNode = new Node[T](value, null)

    if (head == null) {
      head = newNode
    } else {
      traverse((_, _) => false).next = newNode
    }

    newNode
  }

  def remove(node: Node[T]): Unit = {
    if (head == null) return

    if (head.value == node.value) {
      head = head.next
    } else {
      traverse((current, last) => {
        if (current.value == node.value) {
          last.next = current.next
          true
        } else false
      })
    }
  }

}

object Node {
  def apply[T](value: T): Node[T] = new Node(value, null)
  def apply[T](value: T, next: Node[T]): Node[T] = new Node(value, next)
}

class Node[T](val value: T, var next: Node[T]) {
  override def toString: String = value.toString
}
