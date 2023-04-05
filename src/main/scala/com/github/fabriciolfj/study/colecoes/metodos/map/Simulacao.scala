package com.github.fabriciolfj.study.colecoes.metodos.map

class Simulacao {

}

@main def execute(): Unit = {
  val list = List("maca", "pera", "melencia", "melao", "1", "9", "8")

  val result = list
    //.filter(p => p.startsWith("m"))
    //.filter(m => m.length > 4)
    .map(r => r.toIntOption)
    .flatten

  result.foreach(println)
}
