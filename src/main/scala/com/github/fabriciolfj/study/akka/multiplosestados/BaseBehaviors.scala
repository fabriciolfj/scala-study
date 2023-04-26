package com.github.fabriciolfj.study.akka.multiplosestados

import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}

sealed trait BaseBehaviors

sealed trait ClarkKentBehaviors extends BaseBehaviors
final case object WorkAtNewsPaper extends ClarkKentBehaviors
final case object PutOnGlasses extends ClarkKentBehaviors
final case object BecomeSuperman extends ClarkKentBehaviors

sealed trait SupermanBehaviors extends BaseBehaviors
final case object Fly extends SupermanBehaviors
final case object SavePeople extends SupermanBehaviors
final case object BecomeClarkKent extends SupermanBehaviors

object ClarkKent {

  def apply(): Behavior[BaseBehaviors] = clarkKentState()

  private def clarkKentState() : Behavior[BaseBehaviors] = Behaviors.receiveMessagePartial[BaseBehaviors] {
    case WorkAtNewsPaper =>
      println("normal: WorkAtNewsPaper")
      Behaviors.same
    case PutOnGlasses =>
      println("normal: PutOnGlasses")
      Behaviors.same
    case BecomeSuperman =>
      println("normal: BecomeSuperman")
      supermanState()
  }

  private def supermanState() : Behavior[BaseBehaviors] = Behaviors.receiveMessagePartial[BaseBehaviors] {
    case Fly =>
      println("superman: FLY")
      Behaviors.same
    case SavePeople =>
      println("superman: SAVEPEOPLE")
      Behaviors.same
    case BecomeClarkKent =>
      println("superman: BECOME CLARK KENT")
      clarkKentState()
  }
}