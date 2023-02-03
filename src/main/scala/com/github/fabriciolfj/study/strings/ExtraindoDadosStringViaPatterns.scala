package com.github.fabriciolfj.study.strings

@main def executeExtracao() : Unit = {
  val pattern = "([0-9]+) ([A-Za-z]+)".r

  val pattern(count, fruit) = "100 bananas"

  println(s"$count")
  println(s"$fruit")

  val moviesZipRE = "movies (\\d{5})".r
  val moviesNearCityStateRE = "movies near ([a-z]+), ([a-z]{2})".r

  var msg1 = "movies near 80301"
  var msg2 = "movies 80301"
}
