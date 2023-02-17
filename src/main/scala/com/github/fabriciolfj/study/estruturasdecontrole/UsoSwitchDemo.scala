package com.github.fabriciolfj.study.estruturasdecontrole

import scala.annotation.switch

@main def executeSwitchDemo() : Unit = {
  val i = 1
  val result = (i: @switch) match
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other"

  println(result)

  val value = "go"
  val result2 = (value: @switch) match
    case "go" | "start" => 1
    case "teste" | "end" => 2
    case _ => 0

  println(result2)
}
