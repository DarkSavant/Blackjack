import org.scalatest.{FlatSpec, Matchers}

class DealerTest extends FlatSpec with Matchers {
  "Dealer under or equal to 16" should "hit" in {
    val dealer = new Dealer(10,6)
    dealer.play(2)
    dealer.total() should be (18)
  }

  "Dealer over 16" should "not hit" in {
    val dealer = new Dealer(10,7)
    dealer.play(2)
    dealer.total() should be (17)
  }
}