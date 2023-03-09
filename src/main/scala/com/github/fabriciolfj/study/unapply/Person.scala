package com.github.fabriciolfj.study.unapply

class Person(val name: String, val age: Int)

object Person {
  def unapply(p: Person) : Option[(String, Int)] = Some(p.name, p.age)
}