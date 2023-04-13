package com.github.fabriciolfj.study.colecoes.maps.iteracao

class Simulacao {

}


@main def execute() : Unit = {
  val grades = Map(
    "Al" -> 80,
    "Kim" -> 95,
    "Teri" -> 85,
    "Julia" -> 90
  )

  grades.foreach(v => println(s"key ${v._1} value ${v._2}"))

  val result = grades.view.mapValues(_ * 2).toMap
  println(result)

  val resultV2 = grades.transform((k, v) => v + k)
  println(resultV2)

  for v <- grades do println(s"key ${v._1} value ${v._2}")
}

