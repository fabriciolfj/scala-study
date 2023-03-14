package com.github.fabriciolfj.study.metodos.patternbuilder

class Person {

  protected var _firstName = ""
  protected var _lastName = ""

  def setFirstName(firstName: String): this.type =
    _firstName = firstName
    this

  def setLastName(lastName: String): this.type =
    _lastName = lastName
    this
}
