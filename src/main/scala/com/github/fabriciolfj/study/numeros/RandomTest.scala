package com.github.fabriciolfj.study.numeros

import scala.util.Random

@main def executeRandom() : Unit = {
  val r = Random

  println(r.nextInt(100))

  val list = (0 to r.nextInt(10)).toList
  println(list)

  val result = for i <- 0 to r.nextInt(10) yield i * 10

  println(result)

  val result2 = for i <- 1 to 5 yield r.nextInt(10)
  println(result2)

  val result3 = for i <- 0 to 5 yield i

  println(result3)

}
