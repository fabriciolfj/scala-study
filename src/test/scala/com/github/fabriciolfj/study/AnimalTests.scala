package com.github.fabriciolfj.study
import com.github.fabriciolfj.study.models.Animal
import org.scalatest.funsuite.AnyFunSuite

class AnimalTests extends AnyFunSuite{

  val a = Animal()
  assert(a.numLegs == 2)

  a.numLegs = 4
  assert(a.numLegs == 4)

  val b = Animal()
  assert(a.iHaveMoreLegs(b))

}
