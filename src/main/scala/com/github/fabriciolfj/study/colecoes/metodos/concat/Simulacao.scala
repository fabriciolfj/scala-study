package com.github.fabriciolfj.study.colecoes.metodos.concat

import scala.collection.mutable.ArrayBuffer

class Simulacao {

}


@main def execute(): Unit = {
  val a = List(1, 2, 3, 4)
  val b = Vector(4, 5, 6)

  val c = a.concat(b)//a ++ b

  println(c)

  //mutavel
  val e = ArrayBuffer(1, 2, 3)
  e ++= Seq(4, 5, 6)
  e ++= List(7, 8)

  println(e)

  //para mesclar 2 listas
  val f  = List(1, 2, 3, 4)
  val g = List(4, 5, 6, 7)
  val h = f ::: g

  println(h)
}