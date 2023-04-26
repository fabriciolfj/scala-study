package com.github.fabriciolfj.study.akka.termostato

import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}

object ThermostatActor {
  import ThermostatSupervisor.{SystemMessage, StringMessage}

  sealed trait MessageToThermostat {
    def sender: ActorRef[SystemMessage]
  }

  final case class CurrentTemperature(sender: ActorRef[SystemMessage]) extends MessageToThermostat
  final case class IncreaseTemperature(sender: ActorRef[SystemMessage], amount: Int) extends MessageToThermostat
  final case class DecreaseTemperature(sender: ActorRef[SystemMessage], amount: Int) extends MessageToThermostat

  var currentTemp = 72

  def apply(): Behavior[MessageToThermostat] = Behaviors.setup {
    context => Behaviors.receiveMessage {
        case CurrentTemperature(sender) =>
          sendApply(sender)
          Behaviors.same
        case IncreaseTemperature(sender, amount) =>
          currentTemp += amount
          sendApply(sender)
          Behaviors.same
        case DecreaseTemperature(sender, amount) =>
          currentTemp -= amount
          sendApply(sender)
          Behaviors.same
    }
  }

  private def sendApply(sender: ActorRef[SystemMessage]) = {
    val msg = s"thermostat: temperature is $currentTemp degress"
    println(msg)
    sender ! StringMessage(msg)
  }

}
