package com.github.fabriciolfj.study.colecoes.ordenandoarray

class Person(val firstName: String, val lastName: String) {

  override def toString: String = s"$firstName $lastName"
}

given personComparing : Ordering[Person] with
  override def compare(a: Person, b: Person): Int = a.firstName compare b.firstName