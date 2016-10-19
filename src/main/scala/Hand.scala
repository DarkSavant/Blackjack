case class Hand(firstCard: Int, secondCard: Int) {
  var cards: List[Int] = List(firstCard, secondCard)

  def hit(hitCard: Int) = cards = hitCard :: cards

  def replace11(card: Int):Int = {
    if (card == 11)
      return 1
    return card
  }

  def total() = {
    var total = cards.sum
    if (total > 21 && cards.contains(11)) {
      total = cards.map(replace11(_)).sum
    }
    total
  }
  def won(loser: Hand) = total() < 22 && total > loser.total()
}
