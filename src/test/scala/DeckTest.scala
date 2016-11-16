import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

class DeckTest extends FlatSpec with Matchers {
  "Deal" should "return next card" in {
    val deck = Deck(mutable.Stack(1,2,3,4,5,6,7,8,9,10,11))
    deck.deal() should be (1)
    deck.deal() should be (2)
  }

  "Shuffle" should "shuffle deck" in {
    val deck = Deck(mutable.Stack(2,3,4,5,6,7,8,9,10,10,10,10,11))
    deck.shuffle()
  }
}
