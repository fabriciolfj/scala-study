package com.github.fabriciolfj.study.colecoes.tuplas

class Simulacao {

}

@main def execute() : Unit = {
  val (name, age) = getUserInfo()
  println(s"$name $age")

  val result = 1 *: "a" *: EmptyTuple
  println(result)
  
  val stock = Stock("LA", 22.33)
  val tuple = Tuple.fromProductTyped(stock)
  println(tuple)
}

def getUserInfo() : (String, Int) = {
  ("fabricio", 38)
}
