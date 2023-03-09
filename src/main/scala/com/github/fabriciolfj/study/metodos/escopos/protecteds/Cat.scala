package com.github.fabriciolfj.study.metodos.escopos.protecteds

class Cat {
  protected def isFriendlyCat = true
  def sampleMethod(other: Cat) =
    if other.isFriendlyCat then
      println("ok")
    end if
  end sampleMethod
}



