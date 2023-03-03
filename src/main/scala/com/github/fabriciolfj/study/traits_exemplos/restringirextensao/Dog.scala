package com.github.fabriciolfj.study.traits_exemplos.restringirextensao

class Dog extends CanRun, HasLegs, Pet {
  override def numLegs: Int = 5

  override def test(): String = ""

}


@main def executeTest() : Unit = {
  val dog = Dog()
  dog.run()
}
