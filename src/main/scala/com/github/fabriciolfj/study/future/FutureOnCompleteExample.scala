package com.github.fabriciolfj.study.future

import java.lang.Thread.sleep
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class FutureOnCompleteExample {

}

@main def executeV2() : Unit = {
  println("stating calculation...")
  val f = Future {
    getMeaningOfLife()
  }

  println("before onComplete")
  f.onComplete {
    case Success(value) => println(s"got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace()
  }

  println("A..."); sleep(100)
  println("B..."); sleep(100)
  println("C..."); sleep(100)
  println("D..."); sleep(100)

  sleep(2_000)
}

def getMeaningOfLife() =
  sleep(Random.nextInt(500))
  42
