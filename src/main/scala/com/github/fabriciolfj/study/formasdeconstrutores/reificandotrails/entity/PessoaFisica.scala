package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.Pessoa

case class PessoaFisica(val _nome: String, val cpf: String) extends Pessoa(_nome), Fisica

