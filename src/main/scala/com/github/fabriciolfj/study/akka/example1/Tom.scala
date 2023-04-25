package com.github.fabriciolfj.study.akka.example1


import akka.actor.typed.Behavior
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.AbstractBehavior
import com.github.fabriciolfj.study.akka.example1.Tom.{Hello, Message}

object Tom {
  sealed trait Message
  case object Hello extends Message

  def apply(): Behavior[Message] = Behaviors.setup(context => new Tom(context))
}

private class Tom(context: ActorContext[Message]) extends AbstractBehavior(context) {
  override def onMessage(msg: Message): Behavior[Message] =
    msg match
      case Hello => println(s"oi eu sou o tom")
      this
}
