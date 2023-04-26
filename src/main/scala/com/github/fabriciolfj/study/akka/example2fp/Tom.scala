package com.github.fabriciolfj.study.akka.example2fp

import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import com.github.fabriciolfj.study.akka.example1.OopActor.Message1

object Tom {

  sealed trait Message
  final case object Hello extends Message

  def apply(): Behavior[Message] = Behaviors.setup {
    context => Behaviors.receiveMessage {
          case Hello =>
            println("Hi, I’m Tom.")
            Behaviors.same
        }
      }

}
