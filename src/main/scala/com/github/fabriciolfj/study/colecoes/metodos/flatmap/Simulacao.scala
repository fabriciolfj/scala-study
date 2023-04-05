package com.github.fabriciolfj.study.colecoes.metodos.flatmap

import scala.util.Try

class Simulacao {

}

//utilize quando precisa combilar um flatter com map
@main def execute() : Unit = {
  val list = List("1", "2", "ok")
  val result = list.flatMap(makeInt)

  result.foreach(println)
}

def makeInt(s: String) : Option[Int] = {
  Try(Integer.parseInt(s.trim)).toOption
}
