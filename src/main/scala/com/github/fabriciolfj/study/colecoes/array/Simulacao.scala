package com.github.fabriciolfj.study.colecoes.array

class Simulacao {

}

@main def execute() : Unit = {
  val a = Array[Int]()

  val b = 1 +: a
  val c = a :++ Seq(2, 3)
  val d = Seq(4, 5) ++: c

  println(b(0))
  //for i <- c do println(i)
  for i <- d do println(i)
}
