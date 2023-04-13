package com.github.fabriciolfj.study.colecoes.maps
import scala.collection.mutable.{Map => MMap}

class Simulacao {

}

@main def execute() : Unit = {
  //imutavel
  val a = Map(1 -> "A")
  val b = a + (2 -> "b")
  val c = b ++ Map(3 -> "c", 4 -> "d")
  val d = c ++ List(5 -> "e", 6 -> "f")
  val e = d ++ Map(1 -> "AA")

  println(e)

  val h = e -1
  println(h)

  val g = h -- List(1, 2, 3)
  println(g)

  //mutabel
  //val m = scala.collection.mutable.Map[Int, String]()
  val m = MMap[Int, String]()
  m.put(1, "A")
  m(1) = "DD"
  m += (2 -> "z")
  m ++= Map(1 -> "o")

  println(m)
}
