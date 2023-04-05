package com.github.fabriciolfj.study.colecoes.metodos.filtercolecaomutavel

import scala.collection.mutable.ArrayBuffer

class Simulacao {

}

@main def execute() : Unit = {
  val a = ArrayBuffer.range(1, 10)

  a.filterInPlace(_ < 5)
  a.filterInPlace(_ > 2)

  a.foreach(println)
}
