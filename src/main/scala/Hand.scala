case class Hand(firstCard: Int, secondCard: Int) {
  def playHand(deck: Deck): Unit = {
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
    total(cards)
  }

  def total(cards: List[Int]): Int = {
    var t = cards.sum
    if (t > 21 && cards.contains(11)) {
      t = total(replaceFirst(cards, 11, 1))
    }
    t
  }

  def replaceFirst(cards: List[Int], card: Int, newCard: Int): List[Int] = {
    cards.updated(cards.indexOf(card), newCard)
  }
}
