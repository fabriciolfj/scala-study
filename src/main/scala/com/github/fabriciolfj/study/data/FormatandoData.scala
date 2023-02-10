package com.github.fabriciolfj.study.data

import java.text.DateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@main def executeFormat() : Unit = {
  val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
  val now = LocalDateTime.now()

  println(format.format(now))
}