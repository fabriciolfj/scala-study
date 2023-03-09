package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.{PessoaFisica, PessoaJuridica}
import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entrypoint.JuridicaService

@main def execute() : Unit = {
  val pf = PessoaFisica("fabricio", "33967386830")
  val pj = PessoaJuridica("me mercado", "129323200001-30")

  JuridicaService.execute(pf)
  JuridicaService.executeValidacaoCnpj(pj)
  JuridicaService.execute(pj)
}
