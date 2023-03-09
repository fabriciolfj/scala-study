package com.github.fabriciolfj.study.metodos.escopos.privado

class Cat {
  private def isFriendlyCat = true
  def sampleMethod(other: Cat) =
    if other.isFriendlyCat then
      println("ok")
    end if
  end sampleMethod
}



