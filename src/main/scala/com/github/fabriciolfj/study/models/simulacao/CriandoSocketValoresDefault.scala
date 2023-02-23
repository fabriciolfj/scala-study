package com.github.fabriciolfj.study.models.simulacao
import com.github.fabriciolfj.study.models.Socket

@main def executeCriandoSocketValoresDefault() : Unit = {
  val socket = Socket()

  println(socket)

  val socket2 = Socket(2_000)
  println(socket2)
}
