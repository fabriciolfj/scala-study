package com.github.fabriciolfj.study.akka.multiplosestados

import akka.actor.typed.ActorSystem

object ClarkKentApp extends App {

  val actorSystem: ActorSystem[BaseBehaviors] = ActorSystem(
    ClarkKent(),
    "SupermanSystem"
  )
  actorSystem ! WorkAtNewsPaper

  // these will fail because the system is in the wrong state
  actorSystem ! Fly
  actorSystem ! SavePeople
  actorSystem ! BecomeClarkKent

  // this will work
  actorSystem ! WorkAtNewsPaper

  // now these will work
  actorSystem ! BecomeSuperman
  actorSystem ! Fly
  actorSystem ! SavePeople
  actorSystem ! BecomeClarkKent

  Thread.sleep(500)
  actorSystem.terminate()

}
