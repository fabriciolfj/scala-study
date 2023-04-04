package com.github.fabriciolfj.study.colecoes.metodos.iterator

class Simulacao {

}

@main def execute() : Unit = {
  val i = Iterator(1, 2, 3)
  i.map(_ * 2)
    .filter(_ > 4)
    .foreach(println)
}
