import scala.collection.mutable
import scala.util.Random

case class Deck(cards: mutable.Stack[Int]) {
  def this() {
    this(mutable.Stack(2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11))
  }
  var shuffled = cards
  def shuffle() {
    shuffled = Random.shuffle(cards)
  }

  def deal() = shuffled.pop()
}
