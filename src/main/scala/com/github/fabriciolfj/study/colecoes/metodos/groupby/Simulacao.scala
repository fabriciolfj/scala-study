package com.github.fabriciolfj.study.colecoes.metodos.groupby

class Simulacao {

}

@main def execute() : Unit = {
  val list = (1 to 10).toVector

  val result = list.groupBy(_ % 2 == 0)
  result.get(true)
    .foreach(print)
  
  println()

  result.get(false)
    .foreach(print)
}
