package com.github.fabriciolfj.study.colecoes.metodos.random

import scala.util.Random

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(1, 2, 3, 4, 5)
  val b = Random.shuffle(a)

  println(b)

  val index = randomUnique(b)
  println(index)
}


def randomUnique[A](a : Seq[A]) : A = {
  val i : Int= a.length
  val result : Int = Random.nextInt(i)
  a(result)
}