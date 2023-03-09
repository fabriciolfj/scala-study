package com.github.fabriciolfj.study.formasdeconstrutores.factory

object CartaoFactory {
  def getCartao(value: String) : Cartao = {
    value match
      case "visa" => new Visa
      case "master" => new Master
      case _ => throw new RuntimeException
  }
}
