package com.github.fabriciolfj.study.colecoes.metodos.collect

class Simulacao {

}

@main def execute() : Unit = {
  val list = List.range(1, 10)
  val result = list.collect {
    case i : Int if i > 3 => i
  }

  result.foreach(println)
}