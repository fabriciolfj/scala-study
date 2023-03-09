package com.github.fabriciolfj.study.formasdeconstrutores.factory

sealed trait Cartao {
  def efetuarPagamento() : Unit
}

class Visa extends Cartao {
  override def efetuarPagamento(): Unit = println(s"Pagamento visa")
}

class Master extends Cartao {
  override def efetuarPagamento(): Unit = println(s"Pagamento master")
}