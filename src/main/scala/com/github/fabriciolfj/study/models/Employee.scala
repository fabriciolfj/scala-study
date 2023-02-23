package com.github.fabriciolfj.study.models

class Employee(var firstName : String, var lastName: String):
  println("the constructor begins...")

  var age = 0
  private var salary = 0d

  printEmployeeInfo()

  override def toString: String = s"$firstName $lastName is $age year old"

  def printEmployeeInfo() = println(this)

  println("the constructor ends")


