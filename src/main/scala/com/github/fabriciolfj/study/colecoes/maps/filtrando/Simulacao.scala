package com.github.fabriciolfj.study.colecoes.maps.filtrando

class Simulacao {

}

@main def execute() : Unit = {
  val x = Map(
    1 -> "a",
    2 -> "b",
    3 -> "c"
  )

  //val result = x.filter((k, v) => k > 2)
  val result = x.filter(t =>  t._1 > 2)
  println(result)
}
