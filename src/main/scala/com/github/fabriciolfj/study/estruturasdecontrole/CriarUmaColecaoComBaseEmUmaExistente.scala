package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeCriandoCollection() : Unit = {
  val names = List("fabricio", "suzana", "robert")

  val newNames = for n <- names yield n.capitalize
  println(newNames)
}
