package com.github.fabriciolfj.study.importepackages.giventest

object Adder {
  trait Adder[T]:
    def add(a: T, b: T): T
  given Adder: Adder[Int] with
    def add(a: Int, b: Int) : Int = a + b
  given Adder[String] with
    def add(a: String, b: String) : String = "" + (a.toInt + b.toInt)
}


@main def execute() : Unit = {
  import com.github.fabriciolfj.study.importepackages.giventest.Adder.*
  import com.github.fabriciolfj.study.importepackages.giventest.Adder.{given Adder[Int], given Adder[String]}

  def genericAdder[A](x: A, y: A)(using adder: Adder[A]): A = adder.add(x, y)

  println(genericAdder(1, 1))
  println(genericAdder("2", "2"))
}