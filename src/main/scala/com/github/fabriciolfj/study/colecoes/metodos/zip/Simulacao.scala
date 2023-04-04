package com.github.fabriciolfj.study.colecoes.metodos.zip

class Simulacao {

}

@main def execute() : Unit = {
  val chars = List('A', 'B', 'C')

  chars.zipWithIndex.foreach(
    (c, i) => println(s"value $c, index $i")
  )

  chars.zipWithIndex.foreach(i => println(s"value ${i._1} index ${i._2}"))
  chars.zipWithIndex.foreach {
    case (c, i) => println(s"value $c, index $i")
  }

  for (c, i) <- chars.zip(LazyList from 1) do
    println(s"value $c, index $i")
}
