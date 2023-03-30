package com.github.fabriciolfj.study.colecoes.matrizes

class Simulacao {

}

@main def execute() : Unit = {
  val a = Array(
    Array("a", "b", "c"),
    Array("d", "e", "f")
  )

  println(a(0)(1))

  val b = a.flatten
  for i <- b do println(i)
}
