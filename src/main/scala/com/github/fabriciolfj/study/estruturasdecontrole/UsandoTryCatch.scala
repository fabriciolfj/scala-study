package com.github.fabriciolfj.study.estruturasdecontrole

import scala.util.{Failure, Success, Try}

@main def executeCatch() : Unit = {
  //println(tratamento("45").get)
  //println(tratamento("45c").get)
  tratamento2("23")
}

//try ideal para locais aonde possuem try catch
def tratamento(value: String) : Try[Int] = {
  try
    Success(value.toInt)
  catch
    case t: Throwable => Failure(t)
}

def tratamento2(dado: String) : Option[Int] = {
  var value : Option[Int] = None
  try
    value = dado.toIntOption
    value
  catch
    case _: NumberFormatException => None
  finally
    value match
      case Some(s) => println("ok")
      case None => println("Deu ruim")
}