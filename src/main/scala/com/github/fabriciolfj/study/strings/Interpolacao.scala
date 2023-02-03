package com.github.fabriciolfj.study.strings

import com.github.fabriciolfj.study.models.Aluno

@main def executeTwo(): Unit = {
  val nome = "fabricio"
  val idade = 38
  val peso = 120.0

  println(s"$nome tem ${idade + 1} e pesa ${peso == 120}")

  val fabricio = Aluno("Fabricio", 98)
  println(s"${fabricio.name}")

  val msg = f"peso $peso%.2f quilos"
  println(msg)
}
