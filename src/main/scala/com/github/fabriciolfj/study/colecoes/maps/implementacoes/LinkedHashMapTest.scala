package com.github.fabriciolfj.study.colecoes.maps.implementacoes

import scala.collection.mutable

class LinkedHashMapTest {

}
//mantem a ordem de insercao
@main def execute() : Unit = {
  val map = mutable.LinkedHashMap(
    2 -> "A",
    3 -> "B",
    4 -> "C",
    1 -> "D"
  )

  println(map)

  map += (9 -> "p")
  println(map)
}
