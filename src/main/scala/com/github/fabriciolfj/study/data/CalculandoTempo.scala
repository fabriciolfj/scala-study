package com.github.fabriciolfj.study.data

import java.time.{Instant, Duration}


@main def execute() : Unit = {
  val start = Instant.now
  Thread.sleep(2_000)
  val stop = Instant.now

  val delta = Duration.between(start, stop)
  println(delta.toMillis)
  println(delta.toNanos)
}
