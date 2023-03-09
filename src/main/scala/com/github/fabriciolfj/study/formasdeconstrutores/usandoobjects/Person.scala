package com.github.fabriciolfj.study.formasdeconstrutores.usandoobjects

case class Person private(nome: String) {

}

object Person {
  def apply(nome: String): Person = new Person(nome)
}

@main def execute() : Unit= {
  val person = Person("fabricio")
  println(person.nome)
}