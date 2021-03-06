import org.scalatest._

class BlackjackTest extends FlatSpec with Matchers {
  "A blackjack hand of two deuces" should "total to 4" in {
    val hand = Hand(2,2)
    hand total() should be (4)
  }

  "A hit" should "add a card to the hand" in {
    val hand = Hand(2, 2)
    hand hit 2
    hand total() should be (6)
  }

  "A higher total  hand" should "win" in {
    val winner = Hand(5, 5)
    val loser = Hand(4, 4)
    winner.wins(loser) should be (true)
  }

  "Player hitting twice" should "add both cards to hand" in {
    val hand = Hand(2,2)
    hand hit 4
    hand hit 10
    hand total() should be (18)
  }

  "Aces" should "act as ones if over 21" in {
    val hand = Hand(11,5)
    hand hit 10
    hand total() should be (16)
  }

  "Multiple aces" should "add to highest sum < 21" in {
    val hand = Hand(11,11)
    hand.hit(11)
    hand total() should be (13)
  }
}
