package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeListMatch() : Unit = {
  val list = List(1, 2, 3)
  println(sum(list))
  println(imprimir(List("banana", "maça")))
}

def sum(list: List[Int]) : Int = {
  list match
    case Nil => 0 //todas as listas terminal com Nil
    case n :: rest =>  {
      println(s"valor de n $n")
      println(s"valor de rest $rest")
      n + sum(rest)
    }
}

def imprimir(list: List[String]) : String = {
  list match
    case n :: rest => n + " " + imprimir(rest)
    case Nil => " "
}
