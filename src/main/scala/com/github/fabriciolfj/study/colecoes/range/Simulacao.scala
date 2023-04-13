package com.github.fabriciolfj.study.colecoes.range

class Simulacao {

}

@main def execute() : Unit = {
  val r = (0 to 5 by 2).toList
  for i <- r do println(i)

  //nao inclui o ultimo elemento
  val v = (0 until 5).toList
  for i <- v do println(i)

  //ele nao aloca a memoria, somente conforme o uso
  val t = (1 to 999_999).to(LazyList)
  for i <- t do println(i)

  //valor inicial, o ultimo nao e incluso (igual ao until), 3 parametro e o passo
  List.range(1, 10, 2)

  val x = (1 to 5).map(_ * 2).toList
  println(x)
}