package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.usecase

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.Pessoa

trait ValidarPessoaService {
  def execute(p: Pessoa): Unit = {
    if (p.nome == null) {
      throw new RuntimeException("nome nao informado")
    }
    
    println(s"pessoa ${p.nome} validada")
  }
}
