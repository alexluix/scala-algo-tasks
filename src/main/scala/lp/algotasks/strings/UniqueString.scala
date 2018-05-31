package lp.algotasks.strings

import scala.collection.mutable

/**
  * Trivial check for character uniqueness in a string
  */
object UniqueString {

  def uniqueCharacters(string: String): Boolean = {
    val set = mutable.HashSet[Char]()
    for (character: Char <- string.toCharArray) {
      val added = set.add(character)

      if (!added) return false
    }

    true
  }

}
