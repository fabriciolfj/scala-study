package com.github.fabriciolfj.study.programacaofuncional.example1

class Simulacao {

}

@main def executeFunction() : Unit = {
  val list = List(1, 2, 3, 4, 5)

  val result = list.filter(_ % 2 == 0)

  result.foreach(println)

  val map = Map(1 -> 10, 2 -> 20, 3 -> 30)

  val resultMap = map.transform((k, v) => k + v)
  resultMap.foreach((k, v) => println(s"key $k value $v"))
}
