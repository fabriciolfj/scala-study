package com.github.fabriciolfj.study.colecoes.metodos.reduce

class Simulacao {

}

//resulta em um valor, com base em um algoritmo aplicado a colecao
@main def execute() : Unit = {
  val result = (1 to 10).toVector

  println(result.reduceLeft(_ + _))
  println(result.reduceLeft((a, b) =>  a + b))
  println(result.reduceLeft(_ max _))
  println(result.reduceLeft(_ min _))
}
