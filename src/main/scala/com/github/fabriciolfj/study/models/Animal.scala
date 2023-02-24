package com.github.fabriciolfj.study.models

class Animal {
  private var _numLegs = 2

  def numLegs = _numLegs

  def numLegs_=(numLegs: Int) : Unit = {
    _numLegs = numLegs
  }

  def iHaveMoreLegs(that: Animal) : Boolean =
    this.numLegs > that.numLegs
}
