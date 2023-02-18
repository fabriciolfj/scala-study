package com.github.fabriciolfj.study.estruturasdecontrole

import com.github.fabriciolfj.study.enums.Animal
import com.github.fabriciolfj.study.enums.Animal.Dog
import com.github.fabriciolfj.study.enums.Animal.Cat
import com.github.fabriciolfj.study.enums.Animal.Woodpecker

@main def executeEnum() : Unit = {
  println(getInfo(Dog("Fido")))
  println(getInfo(Cat("Morris")))
  println(getInfo(Woodpecker))
}

def getInfo(a: Animal) : String = a match
  case Dog(moniker) => s"Got a dog, name = $moniker"
  case _: Cat => "got a cat (ignoring the name)"
  case Woodpecker => "That was a Woodpecker"