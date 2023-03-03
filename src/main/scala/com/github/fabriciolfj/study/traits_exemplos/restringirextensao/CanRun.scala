package com.github.fabriciolfj.study.traits_exemplos.restringirextensao


trait CanRun {
  this: HasLegs & Pet =>
  def run() = println(s"$numLegs presente")
  def test() : String

}
