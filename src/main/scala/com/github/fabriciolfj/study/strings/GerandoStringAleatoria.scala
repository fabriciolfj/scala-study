package com.github.fabriciolfj.study.strings

import scala.util.Random

@main def executeGerandoString() : Unit = {
  val result = Random.alphanumeric.take(10).mkString

  println(result)
}
