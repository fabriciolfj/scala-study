package com.github.fabriciolfj.study.colecoes.lazylist

class Simulacao {

}

@main def execute() : Unit = {
  val a = (1 to 1_000_000).to(LazyList)
  println(a(1_000))
  println(a(1))

  val result = a.filter(_ < 1_000)
    .map(_ * 10)

  result.foreach(e => println(e))
}
