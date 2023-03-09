package com.github.fabriciolfj.study.formasdeconstrutores.factory


@main def execute() : Unit = {
  val cartao = CartaoFactory.getCartao("visa")
  cartao.efetuarPagamento()

  val other = CartaoFactory.getCartao("elo")
  other.efetuarPagamento()
}
