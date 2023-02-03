package com.github.fabriciolfj.study.strings


@main def executeCaracteres() : Unit = {
  val msg = "fui pra casa"
  var result = msg.filter(_ != 'a').map(_.toUpper)
  result = msg.map(c => c.toUpper)

  result = for c <- msg yield c.toUpper

  println(s"$result")

  for c <- msg do println(s"$c")
  msg.foreach(println)

}