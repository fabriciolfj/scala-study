package com.github.fabriciolfj.study.numeros

@main def convertStringToNumber() : Unit = {
  val numero = "1".toLong

  println(numero)

  //val numeroChecado = "1".toLongOption
  val numeroChecado = "A".toLongOption

  if (numeroChecado.isEmpty) {
    println("numero invalido")
    return
  }

  println(numeroChecado.get)
}