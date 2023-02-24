package com.github.fabriciolfj.study.models

class EmployeeSun(name: String, val age: Int) extends PersonBase(name):
  override def toString: String = s"$name is $age years old"
