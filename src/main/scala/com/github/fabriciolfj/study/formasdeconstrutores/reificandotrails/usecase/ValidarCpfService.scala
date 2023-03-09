package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.usecase

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.PessoaFisica

trait ValidarCpfService[Fisica] {

  def execute(p: PessoaFisica) : Unit = {
    if (p.cpf == null) {
      throw new RuntimeException("cpf nao informado")
    }

    println(s"cpf ${p.cpf} para pessoa ${p.nome} valido")
  }

}
