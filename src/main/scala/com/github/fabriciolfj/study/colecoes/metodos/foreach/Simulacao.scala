package com.github.fabriciolfj.study.colecoes.metodos.foreach

class Simulacao {

}

@main def execute() : Unit = {
  val nums = Vector(1, 2, 3)
  nums.foreach(i => printAndInt(i))
  nums.foreach(printAndInt(_))
  nums.foreach(printAndInt)
  nums.foreach(i => println(i))

  val map = Map("first_name" -> "fabricio", "last_name" -> "jacob")
  map.foreach(i => println(s"${i._1} --- ${i._2}"))
}

def printAndInt(i: Int): Unit = println(i)

