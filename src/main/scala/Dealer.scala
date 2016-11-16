class Dealer(override val firstCard: Int, override val secondCard: Int) extends Hand(firstCard, secondCard) {
  def play(deck: Deck) {
    while(total() <= 16)
      play(deck.deal())
  }

  def play(newCard: Int) {
      cards = newCard :: cards
  }

  override def toString:String = s"Hand(*,$secondCard)"
}
