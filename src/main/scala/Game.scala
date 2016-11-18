object Game extends App {
  println("Welcome")
  val deck = new Deck
  deck.shuffle()
  var again = "Y"
  do {
    val player = Hand(deck.deal(), deck.deal())
    val dealer = new Dealer(deck.deal(), deck.deal())

    println("Dealer")
    println(dealer)
    println("Your Hand")
    println(player)

    player.playHand(deck)

    if (player.total() > 21) {
      println("You BUST!!")
    } else {
      dealer.playHand(deck)

      println(s"Dealer has ${dealer.total()}")
      if (dealer.wins(player)) {
        println("You lose")
      } else {
        println("You win")
      }
    }

    println("Again?")
    again = scala.io.StdIn.readLine()
  }

  while (again != "N")
}