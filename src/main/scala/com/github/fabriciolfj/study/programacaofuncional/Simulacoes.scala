package com.github.fabriciolfj.study.programacaofuncional

class Simulacoes {

}

@main def executeSimulacoes() : Unit = {
  process(printTest("println"), "ok")
}

def process(f:(String => String), param: String) : Unit = {
  val result = f(param)
  println(result)
}

def printTest(value: String) : (String => String) = (param: String) =>  s"test $value function $param"