package com.github.fabriciolfj.study.strings

@main def executeCaps() : Unit = {
  val nome = "fabricio"
  val result = caps"eu ${nome} fui "
  println(result)
}
