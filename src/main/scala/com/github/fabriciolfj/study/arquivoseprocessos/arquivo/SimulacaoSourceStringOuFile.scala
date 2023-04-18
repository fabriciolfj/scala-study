package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import scala.io.Source

class SimulacaoSourceStringOuFile {

}

@main def executeV5() : Unit = {
  val source = Source.fromString("hello world") //ou pegando um arquivo Source.fromFile()
  val result = getUpperCase(source)

  result.foreach(println)
}

def getUpperCase(source: Source) : List[String] = {
  source.getLines().map(_.toUpperCase).toList
}