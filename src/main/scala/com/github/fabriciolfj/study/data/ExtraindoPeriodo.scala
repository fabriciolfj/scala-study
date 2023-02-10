package com.github.fabriciolfj.study.data

import java.time.temporal.ChronoUnit.*
import java.time.{LocalDate, LocalDateTime}

@main def executeData() : Unit = {
  val now = LocalDateTime.now()
  val next = LocalDateTime.of(2026, 12, 9, 11, 30, 23)

  val years : Long = YEARS.between(now, next)
  val months : Long = MONTHS.between(now, next)
  val days : Long = DAYS.between(now, next)

  println(years)
  println(months)
  println(days)
}
