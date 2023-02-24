package com.github.fabriciolfj.study.models

class Pet(var name: String, var age: Int): 
  def this(name: String) = this(name, 0)

  override def toString: String = s"$name is $age years old"
