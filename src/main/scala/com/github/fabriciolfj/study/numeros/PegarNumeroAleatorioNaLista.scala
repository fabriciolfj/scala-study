package com.github.fabriciolfj.study.numeros

import scala.util.Random

@main def executeList() : Unit = {
  val list = (0 to 100).toList
  val result = getRandomElement(list, Random)

  println(result)
}

def getRandomElement[A](list: Seq[A], random: Random) : A = {
  return list(random.nextInt(list.length))
}

