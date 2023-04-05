package com.github.fabriciolfj.study.colecoes.metodos.alguns

class Simulacao {

}

@main def execute() : Unit = {
  val value = (1 to 10).toVector

  value.drop(3)
    .foreach(print)

  println()

  value.dropRight(3)
    .foreach(print)

  println()

  value.dropWhile(_ < 4).foreach(print)

  println()

  value.take(3)
    .foreach(print)

  println()

  value.takeRight(3)
    .foreach(print)

  println()

  value.takeWhile(_ < 4).foreach(print)
}
