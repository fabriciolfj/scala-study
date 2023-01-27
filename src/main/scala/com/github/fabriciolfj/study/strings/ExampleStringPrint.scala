package com.github.fabriciolfj.study

@main def examplePrintString : Unit = {
  val name = "Fabricio"

  println (s"$name")
  println(s"${name.count(_ == 'i')}")
}