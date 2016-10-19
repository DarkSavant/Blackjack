
lazy val blackjack = (project in file(".")).
  settings(
    name := "blackjack",
    version := "1.0",
    scalaVersion := "2.11.8",
    // https://mvnrepository.com/artifact/org.scalactic/scalactic_2.11
    libraryDependencies += "org.scalactic" % "scalactic_2.11" % "3.0.0",
    // https://mvnrepository.com/artifact/org.scalatest/scalatest_2.11
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0"

  )
