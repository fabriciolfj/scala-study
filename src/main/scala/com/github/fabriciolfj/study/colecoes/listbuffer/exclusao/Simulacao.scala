package com.github.fabriciolfj.study.colecoes.listbuffer.exclusao

import scala.collection.mutable.ListBuffer

class Simulacao {

}

//listbuffer e mutavel
@main def execute() : Unit = {
  val a = ListBuffer(0, 1, 2, 3, 4, 5)

  //exclui a primeira ocorrencia de 1
  a -= 1
  println(a)

  //passa o indice
  a.remove(3)
  println(a)

  a --= List(2, 5)
  println(a)
}