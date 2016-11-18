import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

class DealerTest extends FlatSpec with Matchers {
  "Dealer under or equal to 16" should "hit" in {
    val dealer = new Dealer(10,6)
    dealer.playHand(Deck(mutable.Stack(2)))
    dealer.total() should be (18)
  }

  "Dealer over 16" should "not hit" in {
    val dealer = new Dealer(10,7)
    dealer.playHand(new Deck)
    dealer.total() should be (17)
  }
}
