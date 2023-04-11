package com.github.fabriciolfj.study.colecoes.metodos.intersect

class Simulacao {

}

@main def execute() : Unit = {
  val a = Vector(1, 2, 3, 4)
  val b = Vector(1, 4, 5, 6)

  val c = a.intersect(b)

  println(c)
}
