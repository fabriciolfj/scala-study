package com.github.fabriciolfj.study.programacaofuncional.example2

import jdk.incubator.foreign.SymbolLookup

class UsandoMetodosComoFuncoes {

}

@main def execute() : Unit = {
  val list = List.range(1, 10)

  println(list.filter(isEvenMethod))

  //val isPar = (i: Int) => { i % 2 == 0}
  val isPar: (Int) => Boolean = i => { i % 2 == 0 }
  println(list.filter(isPar))

  val square = scala.math.pow(_, 2)
  println(square(3))

  val funcao = Map(
    "add" -> add,
    "multiply" -> multiply
  )

  val f = funcao("add")
  println(f(1, 4))
}

def isEvenMethod(i: Int) = { i % 2 == 0 }

def add(i: Int, j: Int) = { i + j}
def multiply(i: Int, j: Int) = { i *  j}
