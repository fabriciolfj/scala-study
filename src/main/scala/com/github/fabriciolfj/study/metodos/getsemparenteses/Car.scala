package com.github.fabriciolfj.study.metodos.getsemparenteses

class Car(model: String) {

  @throws(classOf[Exception])
  @throws(classOf[RuntimeException])
  def getModel = model

}


@main def execute() : Unit = {
  val car = Car("fusca")
  println(car.getModel)
}