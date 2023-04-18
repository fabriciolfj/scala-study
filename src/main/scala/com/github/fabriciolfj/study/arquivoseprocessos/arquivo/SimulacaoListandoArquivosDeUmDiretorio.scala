package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import java.io.File

class SimulacaoListandoArquivosDeUmDiretorio {

}


@main def executeV6() : Unit = {
  val files = new File("/Users/fabriciojacob/Documentos/repositorio_9")
    .listFiles()
    .filter(_.isFile)
    .map(_.getName)
    .toList

  files.foreach(println)

  println(s"==============")

  val diretorios = new File("/Users/fabriciojacob/Documentos/repositorio_9")
    .listFiles()
    .filter(_.isDirectory)
    .map(_.getName)
    .toList

  diretorios.foreach(println)
}