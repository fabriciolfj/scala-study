package com.github.fabriciolfj.study.strings

@main def executeRegex() : Unit = {
  val expression = "[0-9]+".r

  val msg = "123 nome teste cidade 110"

  println(expression.findFirstIn(msg).get)
  expression.findAllIn(msg).foreach(println)
}
