package lp.algotasks.bigmachine.datastructurereview.binarytree

import org.scalatest.FlatSpec

import scala.collection.mutable.ArrayBuffer

class BinarySearchTreeSpec extends FlatSpec {

  val subject: BinarySearchTree.type = BinarySearchTree

  it should "build tree from a single element" in {
    val root = subject.build(Array(7))

    assert(root.value === 7)
    assert(root.left === null)
    assert(root.right === null)
  }

  it should "build single-level tree" in {
    val root = subject.build(Array(1, 2, 3))

    assert(root.value === 2)
    assert(root.left.value === 1)
    assert(root.right.value === 3)
  }

  it should "allocate two-level tree" in {
    val root = subject.build(Array(1, 2, 3, 4, 5, 6, 7, 8, 9))

    assert(root.value === 5)
    val l1 = root.left
    assert(l1.value === 2)
    assert(l1.left.value === 1)
    assert(l1.left.left === null)
    assert(l1.left.right === null)
    assert(l1.right.value === 3)
    assert(l1.right.left === null)
    assert(l1.right.right.value === 4)

    val r1 = root.right
    assert(r1.value === 7)
    assert(r1.left.value === 6)
    assert(r1.right.value === 8)
    assert(r1.right.left === null)
    assert(r1.right.right.value === 9)
  }

  it should "do depth-first search" in {
    val root = subject.build(Array(1, 2, 3, 4, 5, 6, 7, 8, 9))

    val buffer = ArrayBuffer[Int]()
    subject.traverse(root, (node: Node[Int]) => buffer.append(node.value))

    assert(buffer.toList.mkString(" ") === "5 2 1 3 4 7 6 8 9")
  }

}
