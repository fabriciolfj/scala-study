package com.github.fabriciolfj.study.colecoes.metodos.span

class Simulacao {

}

@main def execute() : Unit = {
  val list = (1 to 10).toList

  val a = list.span(_ < 5)
  println(s"valor 1 ${a._1} --- valor 2 ${a._2}")

  val b = list.span(_ > 0)
  println(s"valor 1 ${b._1} --- valor 2 ${b._2}")
}
