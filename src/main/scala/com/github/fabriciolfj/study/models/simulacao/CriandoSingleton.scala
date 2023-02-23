package com.github.fabriciolfj.study.models.simulacao

import com.github.fabriciolfj.study.models.Brain

@main def executeCriandoSingleton() : Unit = {
  val brain = Brain.getInstance
  println(brain)
}
