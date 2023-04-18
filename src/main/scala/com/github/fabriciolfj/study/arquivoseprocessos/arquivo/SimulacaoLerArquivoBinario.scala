package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import java.io.{BufferedInputStream, FileInputStream}

class SimulacaoLerArquivoBinario {

}

@main def executeV3() : Unit = {
  val bis = new BufferedInputStream(FileInputStream("/Users/fabriciojacob/Documentos/repositorio_9/file.txt"))
  Iterator.continually(bis.read())
    .takeWhile(_ != -1)
    .foreach(b => println(b.toChar))

  bis.close();
}
