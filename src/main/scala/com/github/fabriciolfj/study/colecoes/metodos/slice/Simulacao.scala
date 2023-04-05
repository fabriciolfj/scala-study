package com.github.fabriciolfj.study.colecoes.metodos.slice

class Simulacao {

}

//começa do index 0 e não leva em consideracao o ate
@main def execute() : Unit = {
  val nums = Vector(1, 2, 3, 4, 5)

  nums.slice(1, 4)
    .foreach(println)
}
