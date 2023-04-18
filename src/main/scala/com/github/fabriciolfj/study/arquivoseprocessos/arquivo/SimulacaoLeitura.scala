package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import scala.io.Source

class SimulacaoLeitura {

}

@main def executeV7() : Unit = {
  val values = Source.fromFile("/Users/fabriciojacob/Documentos/repositorio_9/teste2.txt")
    .getLines()
    .map(_.toUpperCase)
    .toList

  values.foreach(println)
}
