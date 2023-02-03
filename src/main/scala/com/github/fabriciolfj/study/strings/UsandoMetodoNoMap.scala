package com.github.fabriciolfj.study.strings

@main def executeMetodo() : Unit = {
  var result = "HELLO".map(toLower)

  println(s"$result")

  result = "HELLO".map{ c =>
    val i: Int = c.toByte + 32
    i.toChar
  }

  println(s"${result}")
}

def toLower(c: Char) : Char = (c.toByte+32).toChar
