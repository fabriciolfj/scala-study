package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeMatchExpression() : Unit = {
  val result = isTrue("te")

  println(result)
}

def isTrue(a: String) : Boolean = a match
  case "" | "0"  => false
  case _ => true

