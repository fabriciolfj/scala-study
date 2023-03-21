package com.github.fabriciolfj.study.programacaofuncional

class RetornandoUmaFuncao {

}

@main def executeRetornoFuncao() : Unit = {
  val funcao = hello("ola")

  println(funcao("fabricio"))

  val test = saudacao("ingles")
  println(test("fabricio"))
}

def hello(value: String) : (String => String) = (str: String) => s"$value $str"

def saudacao(language: String) : (String => String) = (value: String) => {
  val functionIngles = () => s"hello $value"
  val functionEspanhol = () => s"buenas $value"

  language match
    case "ingles" => functionIngles()
    case "espanhol" => functionEspanhol()
}
