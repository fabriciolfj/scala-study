package com.github.fabriciolfj.study.colecoes.metodos.filtrocolecaoimutavel

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(1, 2, 3, 4, 5, 6)
  val result = a.filter(_ % 2 == 0)
  result.foreach(println)
}
