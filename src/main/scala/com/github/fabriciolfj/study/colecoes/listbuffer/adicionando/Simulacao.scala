package com.github.fabriciolfj.study.colecoes.listbuffer.adicionando

import scala.collection.mutable.ListBuffer

class Simulacao {

}

@main def execute() : Unit = {
  val b = new ListBuffer[String]()

  b += "a"
  b += "c"

  b ++= List("d", "e")

  b -= "e"
  b ++= Vector("f", "g")
  println(b)
}
