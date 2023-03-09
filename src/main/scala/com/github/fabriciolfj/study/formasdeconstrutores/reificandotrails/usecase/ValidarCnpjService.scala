package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.usecase

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.PessoaJuridica

trait ValidarCnpjService[Juridica] {

  def executeValidacaoCnpj(p: PessoaJuridica) : Unit = {
    if (p.cnpj == null) {
      throw new RuntimeException("cpf nao informado")
    }

    println(s"cnpj ${p.cnpj} para pessoa ${p.nome} valido")
  }

}
