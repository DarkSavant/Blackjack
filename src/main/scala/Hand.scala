case class Hand(firstCard: Int, secondCard: Int) {
  def play(deck: Deck): Unit = {
    println("Hit(H) or Stay(S)")
    var choice = scala.io.StdIn.readLine()
    while (choice == "H") {
      val newCard = deck.deal()
      println(s"You are dealt $newCard")
      hit(newCard)
      println(s"Total: ${total()}")
      if (total() > 21) {
        choice = "S"
      } else {
        println("Hit(H) or Stay(S)")
        choice = scala.io.StdIn.readLine()
      }
    }
  }

  var cards = List(firstCard, secondCard)

  def hit(hitCard: Int) = {
    cards = hitCard :: cards
  }

  def wins(other: Hand) = total() < 22 && total > other.total()

  def total(): Int = {
    var total = cards.sum
    if (total > 21 && cards.contains(11)) {
      total = cards.map(replace11).sum
    }
    total
  }

  def replace11(card: Int): Int = {
    if (card == 11)
      return 1
    card
  }

}
