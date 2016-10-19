import scala.collection.mutable
import scala.util.Random

case class Deck(cards: mutable.Stack[Int]) {
  var shuffled = cards
  def shuffle() {
    shuffled = Random.shuffle(cards)
  }

  def deal() = shuffled.pop()
}
