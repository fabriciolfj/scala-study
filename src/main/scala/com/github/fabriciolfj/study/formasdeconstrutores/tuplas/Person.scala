package com.github.fabriciolfj.study.formasdeconstrutores.tuplas

case class Person private(nome: String, age: Int) {

}

object Person {
  def apply(nome: String): Person = new Person(nome, 0)
  def apply(t: (String, Int)) = new Person(t(0), t(1))
  def apply(ts: (String, Int)*) = for t <- ts yield new Person(t(0), t(1))
}

@main def execute() : Unit= {
  val persons = Person(("fabricio", 38), ("Suzana", 33))
  for p <- persons do println(p.nome)
}