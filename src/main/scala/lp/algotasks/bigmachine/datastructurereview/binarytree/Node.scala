package lp.algotasks.bigmachine.datastructurereview.binarytree

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

  def traverseDepthInOrder[T](node: Node[T], f: Node[T] => Unit): Node[T] = {
    if (node == null) return null

    traverseDepthInOrder(node.left, f)
    f(node)
    traverseDepthInOrder(node.right, f)
  }

  def traverseDepthPostOrder[T](node: Node[T], f: Node[T] => Unit): Node[T] = {
    if (node == null) return null

    traverseDepthInOrder(node.left, f)
    traverseDepthInOrder(node.right, f)
    f(node)

    null
  }

  def traverseDepthPreOrder[T](node: Node[T], f: Node[T] => Unit): Node[T] = {
    if (node == null) return null

    f(node)
    traverseDepthInOrder(node.left, f)
    traverseDepthInOrder(node.right, f)
  }

  private def buildTree[T](data: Array[T], start: Int, end: Int): Node[T] = {
    if (end < start) return null

    val mid = (start + end) / 2

    Node(buildTree(data, start, mid - 1), buildTree(data, mid + 1, end), data(mid))
  }

}
