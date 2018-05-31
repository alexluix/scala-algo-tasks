package lp.algotasks.strings

/**
  * In-place removal of elements from an array
  */
object ArrayRemoving {

  def removeCharacters(array: Array[Int], x: Int): Unit = {
    var write = 0
    for (i <- array.indices) {
      if (array(i) != x) {
        array(write) = array(i)
        write += 1
      }
    }

    if (write < array.length) {
      for (i <- write until array.length) {
        array(i) = 0
      }
    }
  }

}
