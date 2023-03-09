package com.github.fabriciolfj.study.metodos.escopos.privado

class CatPrivateSimulation {

}

@main def execute() : Unit = {
  val cat = Cat()
  val cat2 = Cat()
  
  cat.sampleMethod(cat2)
}