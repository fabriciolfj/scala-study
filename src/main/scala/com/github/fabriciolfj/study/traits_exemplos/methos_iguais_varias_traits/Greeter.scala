package com.github.fabriciolfj.study.traits_exemplos.methos_iguais_varias_traits

class Greeter extends Hello, Hi, Yo {
  override def greet: String = super.greet //pega o valor da ultima trail extendida
  def greetHello = super[Hello].greet
  def greetHi = super[Hi].greet
  def greetYo = super[Yo].greet
}


@main def executeGreeter() : Unit = {
  val value = Greeter()
  println(value.greet)
  println(value.greetHi)
  println(value.greetYo)
  println(value.greetHello)
}