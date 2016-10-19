import scala.collection.mutable

object Game extends App {
  println("Welcome")
  val deck = Deck(mutable.Stack(2,3,4,5,6,7,8,9,10,10,10,10,11))
  deck.shuffle()

  val player = Hand(deck.deal(), deck.deal())
  val dealer = new Dealer(deck.deal(), deck.deal())

  println("Dealer")
  println(dealer)
  println("Your Hand")
  println(player)
  println("Hit(H) or Stay(S)")
  var choice = scala.io.StdIn.readLine()
  while (choice == "H") {
    val newCard = deck.deal()
    println(s"You are dealt $newCard")
    player.hit(newCard)
    println(s"Total: ${player.total()}")
    if (player.total() > 21) {
      println("You BUST!!!")
      System.exit(0)
    }

    println("Hit(H) or Stay(S)")
    choice = scala.io.StdIn.readLine()
  }

  dealer.play(deck)

  println(s"Dealer has ${dealer.total()}")
  if (dealer.wins(player)) {
    println("You lose")
  } else {
    println("You win")
  }
}