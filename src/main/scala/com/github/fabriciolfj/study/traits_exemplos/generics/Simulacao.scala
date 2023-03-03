package com.github.fabriciolfj.study.traits_exemplos.generics

class Simulacao {

}


@main def execute() : Unit = {
  var big = BigDog()
  
  BigBarker.bark(big)
  
  var small = LittleDog()
  LittleBarker.bark(small)
}
