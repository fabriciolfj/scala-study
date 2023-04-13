package com.github.fabriciolfj.study.colecoes.maps.pegandochavesouvalores

class Simulacao {

}

@main def execute() : Unit = {
  val states = Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska",
    "AZ" -> "Arizona"
  )

  println(states.keys)
  println(states.valuesIterator)
}
