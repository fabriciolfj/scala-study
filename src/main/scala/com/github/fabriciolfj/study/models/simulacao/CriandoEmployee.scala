package com.github.fabriciolfj.study.models.simulacao

import com.github.fabriciolfj.study.models.Employee

@main def executeEmployee() : Unit = {
  var employee = Employee("Fabricio", "Lucas")

  employee.lastName = "teste"
  employee.age = 38

  employee.printEmployeeInfo()

}
