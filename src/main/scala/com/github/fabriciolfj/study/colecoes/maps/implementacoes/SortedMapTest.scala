package com.github.fabriciolfj.study.colecoes.maps.implementacoes

import scala.collection.mutable


class SortedMapTest {

}

@main def executeV2() : Unit = {
  val map = mutable.SortedMap[Int, String]()
  map ++= Map(1 -> "A", 4 -> "C", 3 -> "F", 2 -> "B")

  println(map)

  map += (9 -> "p")
  println(map)
}
