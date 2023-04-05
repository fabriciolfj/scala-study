package com.github.fabriciolfj.study.colecoes.metodos.foldleft

class Simulacao {

}

//fornece um valor para participar ou semente
@main def execute() : Unit = {
  val list = (0 to 10).toList

  println(list.foldLeft(10)((a, b) => a + b))
}
