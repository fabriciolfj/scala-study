package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeCustom() : Unit = {
  val age = 21
  val numAccidents = 0

  doubleIf(age > 18)(numAccidents == 0) { println("Discount!") }
}


def doubleIf(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) =
  if test1 && test2 then codeBlock
