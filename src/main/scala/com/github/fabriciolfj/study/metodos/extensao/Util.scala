package com.github.fabriciolfj.study.metodos.extensao

class Util {

}

extension (s: String)
  def markeInt(radix: Int) : Int = Integer.parseInt(s, radix)

extension (s: String)
  def hello() = s"${s.capitalize}"


@main def execute() : Unit = {
  val value = "estou chegando em casa".hello()
  "1".markeInt(2)

  println(value)
}
