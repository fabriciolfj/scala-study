package com.github.fabriciolfj.study.colecoes.view

class Simulacao {

}

@main def execute() : Unit = {
  val a = List.range(0, 3_000_000)
  val result = a.view
    .map(_ + 1)
    .map(_ * 10)
    .filter(_ > 1_000)
    .filter(_ < 10_000)

  println(result)
}