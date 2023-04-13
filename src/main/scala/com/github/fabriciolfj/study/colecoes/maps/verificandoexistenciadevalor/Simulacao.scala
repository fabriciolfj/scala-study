package com.github.fabriciolfj.study.colecoes.maps.verificandoexistenciadevalor

class Simulacao {

}

@main def execute() : Unit = {
  val states = Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska",
    "AZ" -> "Arizona"
  )

  states.get("AL") match
    case Some(state) => println(s"state $state")
    case None => println("state not found")

  var result = states.contains("AL")
  println(result)

  result = states.valuesIterator.contains("Alaska")
  println(result)

  result = states.valuesIterator.contains("Sp")
  println(result)
}
