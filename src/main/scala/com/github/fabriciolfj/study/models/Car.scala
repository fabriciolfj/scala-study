package com.github.fabriciolfj.study.models

case class Car(var ano: Int, var modelo: String)

object Car {
  def apply() = new Car(0, "none")
  def apply(modelo: String) = new Car(0, modelo)
}

@main def executeCar() : Unit = {
  val car  = Car(1922, "ferrari")

  car match
    //case Car(ano, modelo) => println(s"$ano, $modelo")
    case c @ Car(1922, "ferrari") => println(s"${c.ano}, ${c.modelo}")
    case default => println("nao encontrado")

  var car1 = Car()
  println(car1)

  var car2 = Car("gol")
  println(car2)
}