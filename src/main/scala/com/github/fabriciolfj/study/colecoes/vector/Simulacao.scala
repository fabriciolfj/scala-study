package com.github.fabriciolfj.study.colecoes.vector

class Simulacao {

}

@main def execute(): Unit = {
  val a = Vector(0, 1, 2, 3)
  val b = a(2)

  println(b)

  val c = 10 +: a
  println(c)

  val d = a :+ 10
  println(d)

  val e = a ++: Seq(90, 80)
  println(e)

  val f = a :++ Seq(100, 110)
  println(f)

  val g = a.patch(1, Seq(7, 5), 2)
  println(g)

  val h = a.patch(2, Seq(8, 9), 0)
  println(h)
}

