package com.github.fabriciolfj.study.estruturasdecontrole

import com.github.fabriciolfj.study.models.Shape
import com.github.fabriciolfj.study.models.Shape.Square
import com.github.fabriciolfj.study.models.Shape.Circle

@main def executeInstnaceOf() : Unit = {
  println(calc(Circle(1, 1, 2)))
  println(calc(Square(0, 0, 2)))
}

def calc(s: Shape) : Double = {
  s match
    case Circle(_, _, r) => Math.PI * r * r
    case Square(_, _, l) => l * l
}
