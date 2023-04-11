package com.github.fabriciolfj.study.colecoes.ordenacao

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(10, 5, 8, 1, 7).sorted
  println(a)

  //val b = List("dog", "mouse", "cat").sortWith(_ < _)
  val b = List("dog", "mouse", "cat").sortWith((a, b) => a < b)
  println(b)

  val c = List("dog", "mouse", "cat").sortBy(c => c.length)
  println(c)

  val persons = List(Person("fabricio", "jacob"), Person("Suzy", "are"), Person("jose", "fa"))
  val result = persons.sorted(LastNameOrdering)

  println(result)

  val personsV2 = List(PersonV2("suzy"), PersonV2("fabricio"), PersonV2("jose"))
  val resultv2 = personsV2.sorted

  println(resultv2)
}
