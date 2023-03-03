package com.github.fabriciolfj.study.traits_exemplos.generics

trait Barker {
  
  type D <: Dog
  def bark(d: D) : Unit

}
