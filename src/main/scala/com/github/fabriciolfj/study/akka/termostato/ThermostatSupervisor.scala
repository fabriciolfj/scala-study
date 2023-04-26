package com.github.fabriciolfj.study.akka.termostato

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import com.github.fabriciolfj.study.akka.termostato.ThermostatActor.{CurrentTemperature, DecreaseTemperature, IncreaseTemperature}

object ThermostatSupervisor {

  sealed trait SystemMessage
  case object StartSendingMessages extends SystemMessage
  case object StopSendingMessages extends SystemMessage
  case class StringMessage(msg: String) extends SystemMessage

  def apply(): Behavior[SystemMessage] = Behaviors.setup {
    context =>
      val thermostat = context.spawn(ThermostatActor(), "ThermostatActor")
      Behaviors.receiveMessage {
        case StartSendingMessages =>
          thermostat ! CurrentTemperature(context.self)
          thermostat ! IncreaseTemperature(context.self, 1)
          thermostat ! DecreaseTemperature(context.self, 2)
          Behaviors.same
        case StopSendingMessages =>
          Behaviors.same
        case StringMessage(msg) =>
          println(s"MSG: $msg")
          Behaviors.same
    }
  }

}
