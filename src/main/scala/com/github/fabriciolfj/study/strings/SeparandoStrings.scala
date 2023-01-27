package com.github.fabriciolfj.study.strings

@main def executeSep() : Unit = {
  val texto = "carro, moto, cidade".split(",").map(_.toUpperCase())

  texto.foreach(println(_))
}
