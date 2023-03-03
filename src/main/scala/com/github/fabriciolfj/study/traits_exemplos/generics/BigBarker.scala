package com.github.fabriciolfj.study.traits_exemplos.generics

object BigBarker extends Barker {
  override type D = BigDog

  override def bark(d: BigDog): Unit = println("WUF")

}
