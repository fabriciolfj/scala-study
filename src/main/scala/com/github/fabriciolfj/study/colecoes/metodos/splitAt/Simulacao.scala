package com.github.fabriciolfj.study.colecoes.metodos.splitAt

class Simulacao {

}
//ele criar 2 colecoes com base ate no index informado
@main def execute() : Unit = {
  val xs = (1 to 10).toList
  val a = xs.splitAt(1)
  println(a)

  val b = xs.splitAt(4)
  println(b)

}
