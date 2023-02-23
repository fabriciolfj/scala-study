package com.github.fabriciolfj.study.models

class Brain private {

  override def toString: String = "this is the brain."
}

object Brain:
  val brain = Brain()
  def getInstance = brain
