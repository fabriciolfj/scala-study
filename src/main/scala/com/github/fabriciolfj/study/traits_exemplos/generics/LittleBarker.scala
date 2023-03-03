package com.github.fabriciolfj.study.traits_exemplos.generics

case object LittleBarker extends Barker {
  override type D = LittleDog

  override def bark(d: LittleDog): Unit = println("wuf")

}
