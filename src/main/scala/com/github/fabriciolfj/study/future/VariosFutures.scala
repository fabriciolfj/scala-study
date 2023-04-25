package com.github.fabriciolfj.study.future

import java.lang.Thread.sleep
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class VariosFutures {

}

@main def executeV4() : Unit = {

  val f1 = Future {
    sleep(100)
    3
  }

  val f2 = Future {
    sleep(300)
    4
  }

  val f3 = Future {
    sleep(700)
    2
  }

  val result = for
                  r1 <- f1
                  r2 <- f2
                  r3 <- f3
              yield r1 + r2 + r3

  result.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

  sleep(3_000)
}
