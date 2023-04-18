package com.github.fabriciolfj.study.arquivoseprocessos.arquivo

import scala.util.{Failure, Success, Try, Using}

class SimulacaoV1 {

}

@main def execute() : Unit = {
  val result = readFileSeq("/Users/fabriciojacob/Documentos/repositorio_9/teste.txt")
  result match
    case Success(value) => value.foreach(println(_))
    case Failure(exception) => println(s"deu ruim ${exception.getMessage}")
}

def readFileSeq(fileName: String) : Try[Seq[String]] = {
  Using(io.Source.fromFile(fileName, "UTF-8")) { bf =>
    val lines = for
                  line <- bf.getLines()
                yield
                  line.toUpperCase
    lines.toSeq
  }
}
