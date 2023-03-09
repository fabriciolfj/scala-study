package com.github.fabriciolfj.study.metodos.variastrailscommesmonomemetodo

trait Human {
  def yo = "Human"
}

trait Mother extends Human {
  override def yo: String = "Mother"
}

trait Father extends Human {
  override def yo: String = "Father"
}
