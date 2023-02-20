package com.github.fabriciolfj.study.estruturasdecontrole

import com.github.fabriciolfj.study.models.Shape
import com.github.fabriciolfj.study.models.Shape.Square
import com.github.fabriciolfj.study.models.Shape.Circle

@main def executeInstnaceOf() : Unit = {
  println(calc(Circle(1, 1, 2)))
  println(calc(Square(0, 0, 2)))
}

def calc(value: Shape) : Double = {
  value match
  case Circle(_, _, x) => Math.PI * (x * x)
  case Square(_, _, x) => x * x
}