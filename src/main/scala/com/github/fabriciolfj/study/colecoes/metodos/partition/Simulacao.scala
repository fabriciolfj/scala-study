package com.github.fabriciolfj.study.colecoes.metodos.partition

class Simulacao {

}

//cria 2 colecoes em uma tupla, com base no predicado informado
@main def execute() : Unit = {
  val list = (1 to 10).toList

  val a = list.partition(_ < 5)
  println(s"valor 1 ${a._1} --- valor 2 ${a._2}")

  val b = list.partition(_ > 6)
  println(s"valor 1 ${b._1} --- valor 2 ${b._2}")
}
