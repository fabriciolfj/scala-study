package com.github.fabriciolfj.study.programacaofuncional.exemplo6

class FuncaoParcialmenteAplicada {

}

@main def executeFuncaoParcialmente() : Unit = {
  val sum = (a: Int, b: Int, c: Int) => a + b + c
  val sumParcial = sum(1, _, 5)

  println(sumParcial(10))

  val printTest = (prefix: String, text: String, sufixo: String) => s"$prefix $text $sufixo"

  val html = printTest("<div>", _, "</div>")

  println(executePrint(html, "<p>test</p>"))
}

def executePrint(f: String => String, value: String) : String = {
  f(value)
}
