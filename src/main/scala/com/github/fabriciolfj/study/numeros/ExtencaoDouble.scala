package com.github.fabriciolfj.study.numeros

extension (x: Double)
  def ~=(y: Double, tolerance: Double): Boolean =
    if (x - y).abs < tolerance then true else false

@main def testExtension() : Unit = {
  val result = 1.0 ~= (1.1, 2)

  println(result)

  val calc = (5.2 - 6.1).abs

  println(calc)
}