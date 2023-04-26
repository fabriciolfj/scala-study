package com.github.fabriciolfj.study.akka.example2fp

import akka.actor.typed.ActorSystem


object HiImTomFp extends App {

  import Tom.{Message, Hello}

  val actorSystem: ActorSystem[Message] = ActorSystem(Tom(), "teste")

  actorSystem ! Hello
  actorSystem ! Hello
  actorSystem ! Hello

  Thread.sleep(500)
}
