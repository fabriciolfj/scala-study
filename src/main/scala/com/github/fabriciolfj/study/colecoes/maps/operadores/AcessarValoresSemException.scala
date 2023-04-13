package com.github.fabriciolfj.study.colecoes.maps.operadores

class AcessarValoresSemException {

}


@main def executeV2() : Unit = {
  val states = Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska",
    "AZ" -> "Arizona"
  ).withDefaultValue("not found")

  println(states("Sp"))

  println(states.getOrElse("sp", "nao tem"))

  val result = states.get("sp")

  if (result.nonEmpty) {
    println(result.get)
  } else {
    println("nao achei")
  }
}