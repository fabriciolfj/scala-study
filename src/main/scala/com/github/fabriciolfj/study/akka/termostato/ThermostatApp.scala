package com.github.fabriciolfj.study.akka.termostato

import akka.actor.typed.ActorSystem


object ThermostatApp extends App {
  import ThermostatSupervisor.{StringMessage, SystemMessage, StartSendingMessages, StopSendingMessages}

  val actorSystem : ActorSystem[SystemMessage] = ActorSystem(ThermostatSupervisor(), "teste")

  actorSystem ! StartSendingMessages
  Thread.sleep(1_000)
  actorSystem ! StopSendingMessages
  Thread.sleep(500)

  actorSystem.terminate()
}
