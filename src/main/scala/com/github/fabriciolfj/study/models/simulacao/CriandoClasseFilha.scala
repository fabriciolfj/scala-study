package com.github.fabriciolfj.study.models.simulacao
import com.github.fabriciolfj.study.models.EmployeeSun

@main def executeCriandoClasseFilha() : Unit = {
  val employee = EmployeeSun("fabricio", 38)
  println(employee.toString)
}
