package com.github.fabriciolfj.study.akka.example1

import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.{AbstractBehavior, Behaviors}
import com.github.fabriciolfj.study.akka.example1.OopActor.{Message1, Message2}

object OopActor {

  sealed trait Message
  final case object Message1 extends Message
  final case class Message2(param: String) extends Message

  def apply(): Behavior[Message] =
    Behaviors.setup(context => new OopActor(context))
}

private class OopActor(context: ActorContext[OopActor.Message]) extends AbstractBehavior[OopActor.Message](context) {
  override def onMessage(msg: OopActor.Message): Behavior[OopActor.Message] =
    msg match
      case Message1 =>
        Behaviors.same
      case Message2(param) =>
        Behaviors.same
}
