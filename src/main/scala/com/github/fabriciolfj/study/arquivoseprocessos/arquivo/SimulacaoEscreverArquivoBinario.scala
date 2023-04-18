package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import java.io.{BufferedOutputStream, FileOutputStream}

class SimulacaoEscreverArquivoBinario {

}

@main def executeV4() : Unit = {
  val bos = new BufferedOutputStream(FileOutputStream("/Users/fabriciojacob/Documentos/repositorio_9/file.data"))
  val bytes = "hello world".getBytes
  bytes.foreach(b => bos.write(b))
  bos.close()
}
