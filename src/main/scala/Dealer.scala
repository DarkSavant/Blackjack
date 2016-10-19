class Dealer(override val firstCard: Int, override val secondCard: Int) extends Hand(firstCard, secondCard) {
  def play(deck: Deck) {
    while(total() <= 16)
      play(deck.deal())
  }

  def play(newCard: Int) {
    if (total() <= 16)
      cards = newCard :: cards
  }
}
