package com.github.fabriciolfj.study.colecoes.stack

import scala.collection.mutable

class Simulacao {

}

@main def execute() : Unit = {
  val pilha = mutable.Stack[String]()

  //empilha
  pilha.push("a")
  pilha.push("b")

  //desempilha
  val result = pilha.pop()
  println(result)

  //espiona, mas nao tira da pilha
  val next = pilha.top
  println(next)

  //clear limpa mas nao reduz a pilha ja o clearAndShrink, redimensiona a pilha
  pilha.clearAndShrink()

  /*
  val s = Stack[Int]()        // s: collection.mutable.Stack[Int] = Stack()
  s.push(1)                   // s: Stack(1)
  s.push(2,3)                 // s: Stack(3, 2, 1)
  s.pushAll(List(4,5))        // s: Stack(5, 4, 3, 2, 1)
  val a = s.pop               // a=5, s=Stack(4, 3, 2, 1)
  val b = s.popWhile(_ > 2)   // b=List(4, 3), s=Stack(2, 1)
  val c = s.popAll            // c=List(1, 2), s=Stack()
  */
}
