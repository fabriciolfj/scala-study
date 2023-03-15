package com.github.fabriciolfj.study.programacaofuncional.example5

@main def execute() : Unit = {
  val hello = (i: Int) => println(s"hello $i")
  process(hello, 3)

  val helloV2: (Int) => (Unit) = i => println(s"hello $i")
  process(helloV2, 2)

  val isPar = (x: Int, y: Int) =>  { x % y == 0 }

  processV2(isPar, 4, 8)
  processV2(isParV2, 2, 2)
}

def isParV2(x: Int, y: Int) = x % y == 0

def process(f:(Int) => Unit, num: Int) =
  for i <- 1 to num do f(i)

def processV2(f:(Int, Int) => Boolean, x: Int, y: Int) =
  println(f(x, y))