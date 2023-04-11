package com.github.fabriciolfj.study.colecoes.metodos.diff

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(1, 2, 3, 1, 4)
  val b = Vector(4, 5, 6)

  val c = a.distinct.diff(b)

  println(c)
}
