package com.github.fabriciolfj.study.estruturasdecontrole

import scala.annotation.switch

@main def executeSwitchDefault() : Unit = {
  val value = 0
  value match
    case 1 => println("ok")
    case 2 => println("nok")
    case default => println(s"valor default setado $default")
}
