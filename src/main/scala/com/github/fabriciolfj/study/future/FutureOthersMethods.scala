package com.github.fabriciolfj.study.future

import java.lang.Thread.sleep
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global

class FutureOthersMethods {

}

@main def executeV3() : Unit = {
  callback3
}

def callback3 =
  val f : Future[Int] = Future {
    val sleepTime = Random.nextInt(500)
    sleep(sleepTime)
    if sleepTime > 250 then throw new Exception("ka-boom")
    42
  }

  f.andThen {
    case Failure(e) => println(e.getMessage)
    case Success(value) => println(value)
  }

  sleep(1_000)
