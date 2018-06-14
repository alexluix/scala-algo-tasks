package lp.algotasks.bigmachine.datastructurereview.binarytree

import lp.algotasks.bigmachine.datastructurereview.single.Stack

// Make me a binary search tree from a sorted array

object Node {
  def apply[T](value: T): Node[T] = new Node(null, null, value)

  def apply[T](left: Node[T], right: Node[T], value: T): Node[T] = new Node(left, right, value)
}

class Node[T](val left: Node[T], val right: Node[T], val value: T) {
  override def toString: String = String.valueOf(value)
}

object BinarySearchTree {

  def build[T](data: Array[T]): Node[T] = {
    buildTree(data, 0, data.length - 1)
  }

  private def buildTree[T](data: Array[T], start: Int, end: Int): Node[T] = {
    if (end < start) return null

    val mid = (start + end) / 2

    Node(buildTree(data, start, mid - 1), buildTree(data, mid + 1, end), data(mid))
  }

  def traverseInStack[T](node: Node[T], f: Node[T] => Unit): Unit = {
    val stack = Stack[Node[T]]()
    stack.push(node)

    while (stack.peek().isDefined) {
      val n = stack.pop().get

      f(n)
      if (n.right != null) stack.push(n.right)
      if (n.left != null) stack.push(n.left)
    }
  }

  def traverseInOrder[T](node: Node[T], f: Node[T] => Unit): Unit = {
    if (node.left != null) traverseInOrder(node.left, f)
    f(node)
    if (node.right != null) traverseInOrder(node.right, f)
  }

}
