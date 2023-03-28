package com.github.fabriciolfj.study.colecoes.list

class Simulacao {

}

@main def execute() : Unit = {
  val a = List(1, 2, 3)
  println(a)

  val b = List.range(0, 10, 2)
  println(b)

  val c = (1 to 10).toList
  println(c)

  val d = (1 to 10 by 2).toList
  println(d)

  val e = List.fill(3)("fill")
  println(e)

  val f = List.tabulate(5)(n => n * n)
  println(f)

  val r = scala.util.Random
  val result = (for i <- 0 to 10 yield r.nextPrintableChar()).toList
  println(result)
}
