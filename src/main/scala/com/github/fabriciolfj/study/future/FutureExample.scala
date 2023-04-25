package com.github.fabriciolfj.study.future

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}
import scala.util.Random
import concurrent.ExecutionContext.Implicits.global //acesso ao pool de threads

class FutureExample {

}

@main def execute =
  val f = Future {
    Thread.sleep(Random.nextInt(500))
    1 + 1
  }

  val result = Await.result(f, 1.second)
  println(result)

  Thread.sleep(1_000)
