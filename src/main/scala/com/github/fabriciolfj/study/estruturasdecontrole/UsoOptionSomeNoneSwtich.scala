package com.github.fabriciolfj.study.estruturasdecontrole

import scala.annotation.switch

@main def usoOptionSomeNoneSwtich() : Unit =  {
  val value = "45s"
  val result = (value.toIntOption : @switch) match
    case Some(i) => i
    case None => ""

  println(result)

  value.toIntOption match
    case Some(i) => println(i)
    case None => println("deu ruim")

}
