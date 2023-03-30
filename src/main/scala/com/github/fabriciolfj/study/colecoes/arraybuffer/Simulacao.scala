package com.github.fabriciolfj.study.colecoes.arraybuffer

import scala.collection.mutable.ArrayBuffer

class Simulacao {

}

@main def execute() : Unit = {
  val list = ArrayBuffer[String]()

  list.prepend("fabricio")
  list.prependAll(List("lucas", "felicio"))
  list.addOne("carlos")

  //list.remove(3)
  list -= "carlos"
  list --= List("lucas", "felicio")

  println(list)

  val a = Array(1, 2, 3, 4, 5)
  val b = a.filter(_ > 3)
  val c = a.take(2)
  val d = a.drop(2)
  val e = a.find(_ > 3)
  val f = a.slice(0, 3)
}
