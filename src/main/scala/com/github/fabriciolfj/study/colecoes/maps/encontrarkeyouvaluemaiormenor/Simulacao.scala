package com.github.fabriciolfj.study.colecoes.maps.encontrarkeyouvaluemaiormenor

class Simulacao {

}

@main def execute() : Unit = {
  val grades = Map(
    "Al" -> 80,
    "Kim" -> 95,
    "Teri" -> 85,
    "Julia" -> 90
  )

  var result = grades.maxBy(k => k._1.length)
  println(result)

  val resultV2 = grades.valuesIterator.reduceLeft((y, x) => {
    if x > y then
      x
    else
      y
  })

  println(resultV2)
  println(grades.valuesIterator.max)

  val resultV3 = grades.valuesIterator.reduceLeft(_ max _)

  println(resultV3)
}
