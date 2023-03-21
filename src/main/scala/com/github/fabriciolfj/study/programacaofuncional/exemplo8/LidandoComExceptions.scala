package com.github.fabriciolfj.study.programacaofuncional.exemplo8

class LidandoComExceptions {

}

@main def executeLidandoComExceptions() : Unit = {
  val nums = List("1", "4", "z", "9")
  val result = for x <- nums yield makeInt(x)

  println(result.flatten)
}

def makeInt(x: String) =
  try
    Some(x.toInt)
  catch
    case e: Exception => None