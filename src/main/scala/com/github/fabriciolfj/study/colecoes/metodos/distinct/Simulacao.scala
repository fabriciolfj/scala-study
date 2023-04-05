package com.github.fabriciolfj.study.colecoes.metodos.distinct

class Simulacao {

}

@main def execute() : Unit = {
  val persons = List(Person("fabricio", "jacob"), Person("fabricio", "jacob"), Person("suzy", "penna"))
  val result = persons.distinct
  result.foreach(println)
}
