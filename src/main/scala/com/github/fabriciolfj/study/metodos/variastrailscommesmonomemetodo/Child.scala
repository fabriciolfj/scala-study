package com.github.fabriciolfj.study.metodos.variastrailscommesmonomemetodo

class Child extends Human, Mother, Father {
  def printSuper = super.yo
  def printMother = super[Mother].yo
  def printFather = super[Father].yo
  def printHuman = super[Human].yo
}
