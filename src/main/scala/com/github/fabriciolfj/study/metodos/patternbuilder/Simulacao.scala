package com.github.fabriciolfj.study.metodos.patternbuilder

class Simulacao {

}


@main def execute() : Unit = {
  val employee = Employee().setEmployeeNumber(99)
    .setLastName("jacob")
    .setFirstName("fabricio")

  println(employee)
}