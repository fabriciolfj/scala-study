package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeTernario() : Unit = {
  val result = abs(9)
  println(s"$result")

  val resultNew = abs(-9)
  println(s"$resultNew")
}

def abs(a : Int) : Int = {
  if a > 0 then
    a
  else
    a  * -1
}