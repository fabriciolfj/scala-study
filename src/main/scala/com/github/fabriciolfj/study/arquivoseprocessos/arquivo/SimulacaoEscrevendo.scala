package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import java.io.{BufferedOutputStream, BufferedWriter, FileOutputStream, OutputStreamWriter}
import java.nio.charset.StandardCharsets

class SimulacaoEscrevendo {

}

@main def executeV2() : Unit = {
  val bs = BufferedWriter(
    OutputStreamWriter(
      FileOutputStream("/Users/fabriciojacob/Documentos/repositorio_9/teste3.txt"), StandardCharsets.UTF_8
    )
  )

  bs.write("hello world\n")
  bs.write("teste2")
  bs.close()
}

