class Dealer(override val firstCard: Int, override val secondCard: Int) extends Hand(firstCard, secondCard) {
  override def playHand(deck: Deck) {
    while(total() <= 16)
      play(deck.deal())
  }

  def play(newCard: Int) {
      println(s"Dealer has ${total()}")
      println(s"Dealer dealt $newCard")
      cards = newCard :: cards
  }

  override def toString:String = s"Hand(*,$secondCard)"
}
