package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeExpressoesIfThenElse() : Unit = {
  val result = compare(5, 6)
  
  println(result)
}

def compare(a: Int, b: Int) : Int = {
  if a < b then
    -1
  else if a == b then
    0
  else
    1
}
