package com.github.fabriciolfj.study.traits_exemplos.parametrostrait

class Dog(override val name: String) extends Pet(name), Animal {
  override def toString: String = s"dog name: $name"

}
