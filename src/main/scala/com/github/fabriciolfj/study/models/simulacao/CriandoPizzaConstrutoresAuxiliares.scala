package com.github.fabriciolfj.study.models.simulacao

import com.github.fabriciolfj.study.models.Pizza.{DefaultCrustSize, DefaultCrustType}
import com.github.fabriciolfj.study.models.Pizza

@main def executeCriandoPizzaConstrutoresAuxiliares() : Unit = {
  val p2 = Pizza(DefaultCrustSize)
  val p3 = Pizza(DefaultCrustType)
  val p4 = Pizza()

  println(p2)
  println(p3)
  println(p4)
}
