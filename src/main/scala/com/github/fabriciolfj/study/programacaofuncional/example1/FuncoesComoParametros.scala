package com.github.fabriciolfj.study.programacaofuncional.example1

@main def execute() : Unit = {
  val double: (Int) => Int = i => { i * 2 }

  val list = List(1, 2, 3, 4)

  val result = list.map(double)
  println(result)
}

//def map[B](f: (A) => B) : List[B]
