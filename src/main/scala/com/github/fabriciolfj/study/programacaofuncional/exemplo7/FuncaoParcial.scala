package com.github.fabriciolfj.study.programacaofuncional.exemplo7

class FuncaoParcial {

}

@main def executeFuncaoParcial() : Unit = {
  val divide = new PartialFunction[Int, Int] {
    override def apply(x: Int): Int = 42 / x
    def isDefinedAt(x: Int) = x != 0
  }

  val value = if divide.isDefinedAt(2) then Some(divide.apply(2)) else None
  println(value)

  val result = List(0, 1, 2).collect(divide)
  println(result)

  encadeandoFuncoes()
}


def encadeandoFuncoes() : Unit = {

  val convertOneToFive = new PartialFunction[Int, String] {
    val nums = List("one", "two", "three", "four", "five")
    override def apply(x: Int): String = nums(x-1)
    def isDefinedAt(y: Int) : Boolean =  y >= 1 && y <= 5
  }

  val convertSixToTen = new PartialFunction[Int, String] {
    val nums = List("six", "seven", "eight", "nine", "ten")
    override def apply(x: Int): String = nums(x-6)
    def isDefinedAt(y: Int) = y >= 6 && y <= 10
  }

  val convertGeral = convertOneToFive orElse( convertSixToTen)

  println(convertGeral(6))
}

