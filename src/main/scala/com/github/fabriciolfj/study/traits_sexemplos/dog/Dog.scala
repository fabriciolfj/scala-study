package com.github.fabriciolfj.study.traits_sexemplos.dog

class Dog extends Pet, HashLegs {

  def comeToMaster() = println("i m coming!")
}


@main def executeDog() : Unit = {
  var dog = Dog()
  dog.speak()
  dog.run()
  dog.comeToMaster()
}