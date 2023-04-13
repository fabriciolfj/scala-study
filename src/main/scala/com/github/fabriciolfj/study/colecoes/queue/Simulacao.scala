package com.github.fabriciolfj.study.colecoes.queue

import scala.collection.immutable.Queue
import scala.collection.mutable

class Simulacao {

}

@main def execute() : Unit = {
  val q = mutable.Queue[Int]()

  q.enqueue(1)
  q.enqueue(2)
  q.enqueue(3)

  println(q)

  val r = q.dequeue
  println(r)
  println(q)

  var qv1 = Queue(1, 2, 3, 4)
  val (r1, qv2) = qv1.dequeue
  println(r1)
  println(qv2)
}
