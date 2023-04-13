package com.github.fabriciolfj.study.colecoes.set

import scala.collection.mutable

class Simulacao {

}

@main def execute() : Unit = {
  var x = Set(1, 2, 3)
  x ++= List(4, 5)

  println(x)

  x += 9
  x += 9
  println(x)

  val s = scala.collection.mutable.Set(1, 4, 5, 6, 7, 8)
  s.add(99)
  println(s)

   s -= 5
  println(s)

  s.subtractOne(6)
  println(s)

  s.remove(4)
  println(s)

  val sort = mutable.SortedSet(1, 2, 5, 8, 9)
  println(sort)

  //na ordem em que sao insereidos
  val hash = mutable.LinkedHashSet(1, 2, 9, 10)
  println(hash)
}