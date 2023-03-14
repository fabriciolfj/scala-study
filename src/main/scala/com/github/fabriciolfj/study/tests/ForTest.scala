package com.github.fabriciolfj.study.tests

class ForTest {

}

@main def execute() : Unit = {
  val xs = List(1, 2, 3, 4, 5)
  val ys = for
    x <- xs
    if x > 2
  yield
    x * 10

  println(ys)
}
