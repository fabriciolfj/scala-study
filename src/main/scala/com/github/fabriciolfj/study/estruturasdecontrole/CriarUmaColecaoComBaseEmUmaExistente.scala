package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeCriandoCollection() : Unit = {
  val names = List("fabricio", "suzana", "robert")

  val newNames = for i <- names yield i.capitalize
  println(s"$newNames")
}
