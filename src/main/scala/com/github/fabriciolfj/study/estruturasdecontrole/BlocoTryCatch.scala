package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeBlocoTryCatch() : Unit = {
  val result = try
    Some("1".toInt)
  catch
    case e: NumberFormatException => None

  println(result.get)
}
