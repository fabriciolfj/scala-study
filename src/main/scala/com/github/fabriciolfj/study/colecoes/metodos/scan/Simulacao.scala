package com.github.fabriciolfj.study.colecoes.metodos.scan

class Simulacao {

}

//retorna uma lista com os resultados parciais
@main def execute() : Unit = {
  val list = (0 to 10).toList
  
  
  list.scan(0)((a, b) => a + b).foreach(println)
}