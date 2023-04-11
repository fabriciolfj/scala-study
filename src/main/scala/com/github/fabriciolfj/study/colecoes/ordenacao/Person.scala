package com.github.fabriciolfj.study.colecoes.ordenacao

class Person(val name: String, val lastName: String) {

  override def toString: String = s"$name $lastName"
}

object LastNameOrdering extends Ordering[Person] :
  override def compare(x: Person, y: Person): Int = x.lastName compare y.lastName