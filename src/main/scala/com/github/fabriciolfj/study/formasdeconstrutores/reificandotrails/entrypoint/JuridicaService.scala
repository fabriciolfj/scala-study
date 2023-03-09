package com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entrypoint

import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.entity.Juridica
import com.github.fabriciolfj.study.formasdeconstrutores.reificandotrails.usecase.{ValidarCnpjService, ValidarPessoaService}

object JuridicaService extends ValidarPessoaService , ValidarCnpjService[Juridica]