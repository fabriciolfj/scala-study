package com.github.fabriciolfj.study.colecoes.metodos.mkstrings

import scala.collection.mutable.ArrayBuffer

class Simulacao {

}

@main def execute() : Unit ={
  val values = List("apple", "microsoft", "amazon")
  val a = values.mkString("[", ";", "]")
  println(a)

  val buffer = Vector("apple", "microsoft", "amazon")
  val sb = StringBuilder()
  val result = buffer.addString(sb, "@")

  println(result)

  val maps = Map(1 -> "apple", 2 -> "amazon")
  val resultMap = maps.mkString(" | ")
  println(resultMap)
}
