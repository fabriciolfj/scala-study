package com.github.fabriciolfj.study.programacaofuncional.example4

@main def execute() : Unit = {
  val plusOne = (i: Int) => println(i + 1)
  exec(plusOne)
  exec(plusOneV2)

  val isPar = (i: Int, j: Int) => { i % j == 0 }
  val result = execV2(isPar)

  println(result)
}


def plusOneV2(i: Int) = println(i + 1)
def exec(f: Int => Unit) = f(1)

def execV2(f: (Int, Int) => Boolean) = f(2, 4)
