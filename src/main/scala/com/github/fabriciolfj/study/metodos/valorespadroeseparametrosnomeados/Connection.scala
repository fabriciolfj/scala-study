package com.github.fabriciolfj.study.metodos.valorespadroeseparametrosnomeados

class Connection {

  def execute(timeout: Int = 5_000, protocol : String = "https") =
    println(s"estabelecendo conexao timeout $timeout e protocolo $protocol")

}
