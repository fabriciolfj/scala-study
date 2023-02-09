package com.github.fabriciolfj.study.numeros

@main def executeCast() : Unit = {
  val result = makeInt("5")

  println(result.get)
}

def makeInt(s: String) : Option[Int] = {
  try
    Some(s.toInt)
  catch
    case e: NumberFormatException => None
}
