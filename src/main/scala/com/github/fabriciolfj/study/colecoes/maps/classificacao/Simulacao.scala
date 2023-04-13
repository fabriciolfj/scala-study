package com.github.fabriciolfj.study.colecoes.maps.classificacao

import scala.collection.mutable

class Simulacao {

}

@main def execute() : Unit = {
  val grades = Map(
    "Kim" -> 90,
    "Al" -> 85,
    "Melissa" -> 95,
    "Emily" -> 91,
    "Hannah" -> 92
  )

  var result = mutable.LinkedHashMap(grades.toSeq.sortWith(_._2 > _._2):_*)
  println(result)
}
