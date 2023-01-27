package com.github.fabriciolfj.study.strings

@main def example() : Unit = {
  val name = "Serrana"

  val result = name.drop(2).take(4).capitalize

  println(s"$result")
}