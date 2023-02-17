package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeMatriz() : Unit = {
  val a = Array.ofDim[Int](2, 2)
  a(0)(0) = 0
  a(0)(1) = 1
  a(1)(0) = 2
  a(1)(1) = 3

  for i <- 0  to 1
      j <- 0 to 1
    do {
      println(s"($i)($j) == ${a(i)(j)}")
    }
}
