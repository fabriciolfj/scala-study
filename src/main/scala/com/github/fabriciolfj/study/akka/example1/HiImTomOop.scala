package com.github.fabriciolfj.study.akka.example1

import akka.actor.typed.ActorSystem


object HiImTomOop extends App {

  val actor : ActorSystem[Tom.Message] = ActorSystem.create(Tom(),  "testeQualquerCoisa")
  
  actor ! Tom.Hello
  actor ! Tom.Hello
  actor ! Tom.Hello
  actor ! Tom.Hello
  
  Thread.sleep(500)
  actor.terminate()

}
