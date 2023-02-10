package com.github.fabriciolfj.study.data

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalTime}

@main def executeAnalise() : Unit = {
  stringOk()
  stringHorario()
}

def stringOk() : Unit = {
  val d = LocalDate.parse("2022-12-10")

  println(d)
}

def stringHorario() : Unit = {
  val t = LocalTime.parse("01:02")
  println(t)
}

