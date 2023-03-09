package com.github.fabriciolfj.study.metodos.chamandometodossuperclassoutrail

class Dog extends AnimalWithLegs {

  override def walk(): Unit = {
    super.walk ()
    println("dog is walking")
  }
  
  def walkThenRun = {
    run()
  }

}
