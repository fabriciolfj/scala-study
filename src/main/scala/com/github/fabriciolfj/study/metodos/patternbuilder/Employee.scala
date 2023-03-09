package com.github.fabriciolfj.study.metodos.patternbuilder

class Employee extends Person {
  protected var employeeNumber = 0
  
  def setEmployeeNumber(employeeNumber: Int): this.type =
    this.employeeNumber = employeeNumber
    this

  override def toString: String =
    s"name $_firstName last name $_lastName number $employeeNumber"

}
