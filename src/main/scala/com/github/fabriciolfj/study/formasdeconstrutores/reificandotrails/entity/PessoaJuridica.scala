package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.Pessoa

case class PessoaJuridica(val _nome: String, val cnpj: String) extends Pessoa(_nome), Juridica
