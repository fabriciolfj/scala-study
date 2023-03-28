package com.github.fabriciolfj.study.colecoes.list.adicionandoelementos

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(2, 3)
  val b = 1 :: a
  println(b)

  val c = a :+ 1
  println(c)

  val d = List(4, 5) ::: a
  println(d)

  val e = a ::: List(4, 5)
  println(e)

  val x = 1 :: 2 :: Nil
  println(x)

  val z = a ++ Seq(4, 5)
  println(z)
}
