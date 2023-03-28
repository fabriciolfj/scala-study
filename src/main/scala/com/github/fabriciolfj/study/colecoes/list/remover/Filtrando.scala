package com.github.fabriciolfj.study.colecoes.list.remover

class Filtrando {

}


@main def executeFiltro() : Unit = {
  val a = List(1, 2, 3, 4, 5)
  val b = a.filter(n => n % 2 == 0)
  println(b)

  val c = a.take(2)
  println(c)

  val d = a.drop(2)
  println(d)

  val e = a diff List(1, 2, 3)
  println(e)
}